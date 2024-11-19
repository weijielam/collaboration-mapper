package com.weijielam.collaboration_mapper;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
class LegalEntityController {

    private final LegalEntityRepository repository;

    LegalEntityController(LegalEntityRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/entities")
    List<LegalEntity> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/entities")
    LegalEntity newLegalEntity(@RequestBody LegalEntity newLegalEntity) {
        return repository.save(newLegalEntity);
    }

    // Single item

    @GetMapping("/entities/{id}")
    LegalEntity one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new LegalEntityNotFoundException(id));
    }

//    @GetMapping("/entities/{id}")
//    EntityModel<LegalEntity> one(@PathVariable Long id) {
//
//        LegalEntity employee = repository.findById(id) //
//                .orElseThrow(() -> new LegalEntityNotFoundException(id));
//
//        return EntityModel.of(employee, //
//                linkTo(methodOn(LegalEntityController.class).one(id)).withSelfRel(),
//                linkTo(methodOn(LegalEntityController.class).all()).withRel("entities"));
//    }

    @PutMapping("/entities/{id}")
    LegalEntity replaceLegalEntity(@RequestBody LegalEntity newLegalEntity, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newLegalEntity.getName());
                    employee.setDescription(newLegalEntity.getDescription());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    return repository.save(newLegalEntity);
                });
    }

    @DeleteMapping("/entities/{id}")
    void deleteLegalEntity(@PathVariable Long id) {
        repository.deleteById(id);
    }
}