package org.pms.core.impl;

import org.pms.core.service.AssignTasksService;
import org.pms.orm.beans.AssignBean;
import org.pms.orm.impl.AssignDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class AssignTasksServiceImpl implements AssignTasksService {

    @Autowired
    private AssignDaoImpl assignDao;

    public void assignTask(AssignBean assignBean) {

        assignDao.assignTask(assignBean);

    }

}
