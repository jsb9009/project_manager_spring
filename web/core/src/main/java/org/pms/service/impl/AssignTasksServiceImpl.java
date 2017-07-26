package org.pms.service.impl;

import org.pms.AssignTasksService;
import org.pms.orm.beans.AssignBean;
import org.pms.orm.dao.impl.AssignDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class AssignTasksServiceImpl implements AssignTasksService {

    @Autowired
    private AssignDaoImpl assignDaoImpl;

    public void assignTask(AssignBean assignBean){

        assignDaoImpl.assignTask(assignBean);

    }

}
