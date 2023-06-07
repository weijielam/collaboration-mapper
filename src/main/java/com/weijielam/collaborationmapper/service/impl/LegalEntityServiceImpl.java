package com.weijielam.collaborationmapper.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weijielam.collaborationmapper.dao.LegalEntityDao;
import com.weijielam.collaborationmapper.model.LegalEntity;
import com.weijielam.collaborationmapper.service.LegalEntityService;

@Service
public class LegalEntityServiceImpl implements LegalEntityService {

    @Autowired
    private LegalEntityDao legalEntityDao;

    public List<LegalEntity> getLegalEntities() {
        return legalEntityDao.getLegalEntities();

    }

}
