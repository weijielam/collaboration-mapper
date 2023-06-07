package com.weijielam.collaborationmapper.dao.impl;

import com.weijielam.collaborationmapper.dao.LegalEntityDao;
import com.weijielam.collaborationmapper.model.LegalEntity;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LegalEntityDaoImpl implements LegalEntityDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<LegalEntity> getLegalEntities() {
        Criteria criteria = sessionFactory.openSession().createCriteria(LegalEntity.class);
        return criteria.list();
    }

}
