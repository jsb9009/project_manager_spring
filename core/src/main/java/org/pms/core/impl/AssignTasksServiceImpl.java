package org.pms.core.impl;

import org.pms.core.service.AssignTasksService;
import org.pms.orm.dao.AssignDao;

import org.pms.orm.model.Tasks;
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

    public void assignTask(Tasks tasks) {

        assignDao.assignTask(tasks);

    }

}
