package com.weijielam.collaborationmapper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weijielam.collaborationmapper.model.LegalEntity;
import com.weijielam.collaborationmapper.service.LegalEntityService;

@Controller
public class LegalEntityController {

    @Autowired
    private LegalEntityService legalEntityService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<LegalEntity>> LegalEntity() {

        List<LegalEntity> legalEntities = legalEntityService.getLegalEntities();
        return new ResponseEntity<List<LegalEntity>>(legalEntities, HttpStatus.OK);
    }

}