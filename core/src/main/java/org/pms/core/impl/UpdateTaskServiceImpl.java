package org.pms.core.impl;

import org.pms.core.service.UpdateTaskService;
import org.pms.orm.beans.UpdateTaskBean;
import org.pms.orm.impl.UpdateTaskDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class UpdateTaskServiceImpl implements UpdateTaskService {


    @Autowired
    private UpdateTaskDaoImpl updatetaskDao;

    public void updateTask(UpdateTaskBean updatetaskBean) {

        updatetaskDao.updateTask(updatetaskBean);
    }
}
