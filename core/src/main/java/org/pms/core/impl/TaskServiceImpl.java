package org.pms.core.impl;

import org.pms.core.service.TaskService;
import org.pms.orm.dao.EmployeeDao;
import org.pms.orm.dao.ProjectDao;
import org.pms.orm.dao.TaskDao;
import org.pms.orm.model.Employee;
import org.pms.orm.model.Project;
import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private ProjectDao projectDao;

    @Autowired
    private TaskDao taskDao;


    public void assignTask(Task task) {

        Long id = task.getEmployee().getId();
        Employee employee = employeeDao.getEmployee(id);
        task.setEmployee(employee);
        taskDao.assignTask(task);

    }


    public List<Task> getTasks() {
        return taskDao.getTasks();
    }


    public void updateTask(Task task) {

        Long id = task.getId();
        Task task1 = taskDao.getTask(id);
        task1.setStatus(task.getStatus());
        taskDao.updateTask(task1);
    }


    public List<Task> viewassignedTasks(Employee employee) {

        return taskDao.viewassignedTasks(employee);
    }


    public List<Task> viewTasks() {
        return taskDao.viewTasks();
    }


    public Long createTasks(Task task) {

        Long id = task.getProject().getId();
        Project project = projectDao.getProject(id);
        task.setProject(project);
        return taskDao.createTask(task);

    }

    public void deleteTask(long id) {
        taskDao.deleteTask(id);
    }
}
