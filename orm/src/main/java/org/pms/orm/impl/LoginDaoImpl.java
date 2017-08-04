package org.pms.orm.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.pms.orm.dao.LoginDao;
import org.pms.orm.model.Login;
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

    public String login(Login login) {

        Session session = sessionFactory.openSession();

    /*Try to convert logic with according to the answer of the following question
    https://stackoverflow.com/questions/37857482/correct-alternative-to-sharedsessioncontrac-createcriteriaclass
    -persistentclas
     */

        String sql = "Select login_id from login where username=:username and password=:password";
        Query query = session.createNativeQuery(sql);

        query.setParameter("username", login.getUsername());
        query.setParameter("password", login.getPassword());

        String rs = query.getSingleResult().toString();

        return rs;
    }

}
