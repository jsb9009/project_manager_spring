package org.pms.orm.impl;


import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.pms.orm.dao.ProjectDao;

import org.pms.orm.model.Project;

import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by jaliya on 7/21/17.
 */

@Repository
public class ProjectDaoImpl extends HibernateUtilImpl implements ProjectDao {


    @Override
    public Long saveProject(Project project) {
        return (Long) create(project);
    }


    public Project getProject(Long projectId) {

        Session session = getSession();
        Project project1 = null;

        project1 = (Project) session.get(Project.class, projectId);
        Hibernate.initialize(project1);
        return project1;
    }


    public List<Project> getProjects() {

        Session session = getSession();
        List<Project> projectList = session.createCriteria(Project.class).list();
        return projectList;
    }

    @Override
    public void deleteProject(long id) {
        Project project = new Project();
        project.setId(id);
        delete(project);
    }

}
