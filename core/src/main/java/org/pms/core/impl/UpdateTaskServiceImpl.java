package org.pms.core.impl;

import org.pms.core.service.UpdateTaskService;

import org.pms.orm.dao.UpdateTaskDao;

import org.pms.orm.model.Tasks;
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

    public void updateTask(Tasks tasks) {

        updatetaskDao.updateTask(tasks);
    }

}
