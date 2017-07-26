package org.pms.core.impl;

import org.pms.core.service.AddProjectsService;
import org.pms.orm.beans.ProjectBean;
import org.pms.orm.impl.ProjectDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class AddProjectsServiceImpl implements AddProjectsService {


    @Autowired
    private ProjectDaoImpl projectDaoImpl;

    public void addProjects(ProjectBean projectBean) {

        projectDaoImpl.saveProject(projectBean);


    }
}