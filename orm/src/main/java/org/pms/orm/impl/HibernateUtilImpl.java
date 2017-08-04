package org.pms.orm.impl;

import org.hibernate.SessionFactory;
import org.pms.orm.dao.HibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jaliya on 8/1/17.
 */

@Repository
public class HibernateUtilImpl implements HibernateUtil {


    @Autowired
    private SessionFactory sessionFactory;

    public <T> Serializable create(final T entity) {

        return sessionFactory.getCurrentSession().save(entity);
    }

    public <T> T update(final T entity) {
        sessionFactory.getCurrentSession().update(entity);
        return entity;
    }

    public <T> void delete(final T entity) {

        sessionFactory.getCurrentSession().delete(entity);
    }


    @SuppressWarnings("rawtypes")
    public <T> List<T> fetchAll(String query) {
        return sessionFactory.getCurrentSession().createNativeQuery(query).list();
    }


//    public <T> void delete(Serializable id, Class<T> entityClass) {
//        T entity = fetchById(id, entityClass);
//        delete(entity);
//    }

}
