package org.pms.core.impl;

import org.pms.core.service.UpdateTaskService;

import org.pms.orm.dao.TaskDao;
import org.pms.orm.dao.UpdateTaskDao;

import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by jaliya on 7/26/17.
 */

@Service
@Transactional
public class UpdateTaskServiceImpl implements UpdateTaskService {


    @Autowired
    private UpdateTaskDao updatetaskDao;

    @Autowired
    private TaskDao taskDao;

    public void updateTask(Task task) {

        Long id = task.getId();
        Task task1 = taskDao.getTask(id);
        task1.setStatus(task.getStatus());
        updatetaskDao.updateTask(task1);
    }

}
