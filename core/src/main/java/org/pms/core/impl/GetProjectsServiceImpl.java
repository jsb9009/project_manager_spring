package org.pms.core.impl;

import org.pms.core.service.GetProjectsService;

import org.pms.orm.dao.GetProjectsDao;

import org.pms.orm.model.Projects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jaliya on 7/31/17.
 */

@Transactional
@Service
public class GetProjectsServiceImpl implements GetProjectsService{

    @Autowired
    private GetProjectsDao getprojectsdao;

    public List<Projects> getProjects() {

        return getprojectsdao.getProjects();

    }

}
