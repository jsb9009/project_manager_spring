package org.pms.service.impl;

import org.pms.UpdateTaskService;
import org.pms.orm.beans.UpdateTaskBean;
import org.pms.orm.dao.impl.UpdateTaskDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class UpdateTaskServiceImpl implements UpdateTaskService{


    @Autowired
    private UpdateTaskDaoImpl updatetaskDaoImpl;

    public void updateTask(UpdateTaskBean updatetaskBean){

        updatetaskDaoImpl.updateTask(updatetaskBean);
    }
}
