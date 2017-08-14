package org.pms.orm.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;
import org.pms.orm.dao.LoginDao;
import org.pms.orm.model.Employee;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 * Created by jaliya on 7/26/17.
 */

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {


    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public String login(Employee employee) {

        Session session = sessionFactory.openSession();

        String sql = "Select authentication_level from employee where username=:username and password=:password";
        Query query = session.createNativeQuery(sql);

        query.setParameter("username", employee.getUsername());
        query.setParameter("password", employee.getPassword());

        String rs = query.getSingleResult().toString();

        return rs;
    }

}
