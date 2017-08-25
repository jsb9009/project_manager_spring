package org.pms.orm.impl;

import org.hibernate.Session;


import org.hibernate.query.Query;
import org.pms.orm.dao.LoginDao;
import org.pms.orm.model.Employee;


import org.springframework.stereotype.Repository;


/**
 * Created by jaliya on 7/26/17.
 */

@Repository
public class LoginDaoImpl extends HibernateUtilImpl implements LoginDao {


    public String login(Employee employee) {

        Session session = getSession();

        String sql = "Select authentication_level from employee where username=:username and password=:password";
        Query query = session.createNativeQuery(sql);

        query.setParameter("username", employee.getUsername());
        query.setParameter("password", employee.getPassword());
        try {
            String rs = query.getSingleResult().toString();
            return rs;
        } catch (Exception e) {
            return "";


        }

    }

}
