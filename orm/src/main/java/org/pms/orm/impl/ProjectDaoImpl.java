package org.pms.orm.impl;


import org.pms.orm.dao.ProjectDao;

import org.pms.orm.model.Projects;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jaliya on 7/21/17.
 */

@Repository
@Transactional
public class ProjectDaoImpl implements ProjectDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Override
    public String saveProject(Projects projects) {

        return (String) hibernateutilimpl.create(projects);
    }

}
