package org.pms.core.impl;

import org.pms.core.service.AssignTasksService;
import org.pms.orm.dao.AssignDao;

import org.pms.orm.dao.EmployeeDao;
import org.pms.orm.dao.TaskDao;
import org.pms.orm.model.Employee;
import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
@Transactional
public class AssignTasksServiceImpl implements AssignTasksService {

    @Autowired
    private AssignDao assignDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private TaskDao taskDao;

    public void assignTask(Task task) {

        Long id = task.getEmployee().getId();
        Employee employee =  employeeDao.getEmployee(id);
        task.setEmployee(employee);

        assignDao.assignTask(task);

    }

}
