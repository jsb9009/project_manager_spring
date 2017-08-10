package org.pms.core.impl;

import org.pms.core.service.CreateTasksService;

import org.pms.orm.dao.ProjectDao;
import org.pms.orm.dao.TaskDao;
import org.pms.orm.model.Project;
import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
@Transactional
public class CreateTasksServiceImpl implements CreateTasksService {

    @Autowired
    private TaskDao taskDao;

    @Autowired
    private ProjectDao projectDao;

    public Long createTasks(Task task) {

        Long id = task.getProject().getId();
        Project project =  projectDao.getProject(id);
        task.setProject(project);

        return taskDao.createTask(task);

    }
}
