package org.pms.core.impl;

import org.pms.core.service.ViewAssignedTasksService;

import org.pms.orm.dao.ViewAssignedTasksDao;

import org.pms.orm.model.Employees;
import org.pms.orm.model.Tasks;
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


//    public Tasks chooseEmployeeNo(Tasks tasks) {
//
//        viewassignedtasksdao.chooseEmpoyeeNo(tasks);
//
//        return tasks;
//    }

    public List<Tasks> viewassignedTasks(Tasks tasks) {

        return viewassignedtasksdao.viewassignedTasks(tasks);
    }
}

