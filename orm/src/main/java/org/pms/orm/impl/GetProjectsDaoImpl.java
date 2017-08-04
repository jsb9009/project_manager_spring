package org.pms.orm.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.pms.orm.dao.GetProjectsDao;

import org.pms.orm.model.Projects;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by jaliya on 7/31/17.
 */

@Repository
@Transactional
public class GetProjectsDaoImpl implements GetProjectsDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    public List<Projects> getProjects() {

        String sql = "select project_id from project";

        List<Object> projectObjects = hibernateutilimpl.fetchAll(sql);

        List<Projects> projectsList = new ArrayList<Projects>();

        for (Object projectObject : projectObjects) {
            Projects project = new Projects();
            String id = (String) projectObject;

            project.setProjectId(id);

            projectsList.add(project);
        }
        return projectsList;
    }

}
