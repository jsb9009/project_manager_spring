package org.pms.service.impl;

import org.pms.CreateTasksService;
import org.pms.orm.beans.ProjectBean;
import org.pms.orm.beans.TaskBean;
import org.pms.orm.dao.impl.TaskDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class CreateTasksServiceImpl implements CreateTasksService{

    @Autowired
    private TaskDaoImpl taskDaoImpl;

    public void createTasks(TaskBean taskBean){

        taskDaoImpl.createTask(taskBean);
        
    }
}
