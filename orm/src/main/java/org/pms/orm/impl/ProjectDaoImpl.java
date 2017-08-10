package org.pms.orm.impl;


import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pms.orm.dao.HibernateUtil;
import org.pms.orm.dao.ProjectDao;

import org.pms.orm.model.Project;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.LongSummaryStatistics;

/**
 * Created by jaliya on 7/21/17.
 */

@Repository
@Transactional
public class ProjectDaoImpl implements ProjectDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    @Override
    public Long saveProject(Project project) {

        return (Long) hibernateutilimpl.create(project);
    }


    public Project getProject(Long projectId){

        Session session = sessionFactory.openSession();

        Project project1 = null;
        try {
            project1 =  (Project) session.get(Project.class,projectId);
            Hibernate.initialize(project1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return project1;
    }
}
