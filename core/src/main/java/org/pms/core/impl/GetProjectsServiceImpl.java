package org.pms.core.impl;

import org.pms.core.service.GetProjectsService;
import org.pms.orm.beans.GetProjectsBean;
import org.pms.orm.beans.GetTasksBean;
import org.pms.orm.impl.GetProjectsDaoImpl;
import org.pms.orm.impl.GetTasksDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jaliya on 7/31/17.
 */

@Service
public class GetProjectsServiceImpl implements GetProjectsService{

    @Autowired
    private GetProjectsDaoImpl getprojectsdao;

    public List<GetProjectsBean> getProjects() {

        return getprojectsdao.getProjects();

    }

}
