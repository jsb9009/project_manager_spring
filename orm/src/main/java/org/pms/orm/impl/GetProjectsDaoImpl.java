package org.pms.orm.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pms.orm.dao.GetProjectsDao;

import org.pms.orm.model.Project;
import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaliya on 7/31/17.
 */

@Repository
@Transactional
public class GetProjectsDaoImpl implements GetProjectsDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public List<Project> getProjects() {

        Session session = sessionFactory.openSession();

        List<Project> projectList = session.createCriteria(Project.class).list();

        return projectList;
    }

}
