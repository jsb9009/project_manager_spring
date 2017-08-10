package org.pms.core.impl;

import org.pms.core.service.ViewAssignedTasksService;

import org.pms.orm.dao.EmployeeDao;
import org.pms.orm.dao.ViewAssignedTasksDao;

import org.pms.orm.model.Employee;
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
public class ViewAssignedTasksServiceImpl implements ViewAssignedTasksService {


    @Autowired
    private ViewAssignedTasksDao viewassignedtasksdao;

    @Autowired
    private EmployeeDao employeeDao;


    public List<Task> viewassignedTasks(Task task) {

        Long id = task.getEmployee().getId();
        Employee employee =  employeeDao.getEmployee(id);
        task.setEmployee(employee);

        return viewassignedtasksdao.viewassignedTasks(task);
    }
}

