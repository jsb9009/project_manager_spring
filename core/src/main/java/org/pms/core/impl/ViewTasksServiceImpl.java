package org.pms.core.impl;

import org.pms.core.service.ViewTasksService;

import org.pms.orm.dao.ViewTasksDao;
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
public class ViewTasksServiceImpl implements ViewTasksService {

    @Autowired
    private ViewTasksDao viewtasksDao;

    public List<Tasks> viewTasks() {

        return viewtasksDao.viewTasks();

    }
}
