package org.pms.core.impl;

import org.pms.core.service.AddProjectsService;

import org.pms.orm.dao.ProjectDao;

import org.pms.orm.model.Projects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
@Transactional
public class AddProjectsServiceImpl implements AddProjectsService {


    @Autowired
    private ProjectDao projectDao;

    public void addProjects(Projects projects) {

        projectDao.saveProject(projects);


    }
}