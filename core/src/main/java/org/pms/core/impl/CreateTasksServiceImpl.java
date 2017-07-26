package org.pms.core.impl;

import org.pms.core.service.CreateTasksService;
import org.pms.orm.beans.TaskBean;
import org.pms.orm.impl.TaskDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class CreateTasksServiceImpl implements CreateTasksService {

    @Autowired
    private TaskDaoImpl taskDaoImpl;

    public void createTasks(TaskBean taskBean) {

        taskDaoImpl.createTask(taskBean);

    }
}
