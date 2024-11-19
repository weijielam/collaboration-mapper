package com.weijielam.collaboration_mapper;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
class LegalEntityModelAssembler implements RepresentationModelAssembler<LegalEntity, EntityModel<LegalEntity>> {

    @Override
    public EntityModel<LegalEntity> toModel(LegalEntity legalEntity) {

        return EntityModel.of(legalEntity, //
                linkTo(methodOn(LegalEntityController.class).one(legalEntity.getId())).withSelfRel(),
                linkTo(methodOn(LegalEntityController.class).all()).withRel("entities"));
    }
}