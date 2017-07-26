package org.pms.core.service.impl;

import org.pms.core.ViewTasksService;
import org.pms.orm.beans.ViewTasksBean;
import org.pms.orm.dao.impl.ViewTasksDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class ViewTasksServiceImpl implements ViewTasksService {


    @Autowired
    private ViewTasksDaoImpl viewtasksDaoImpl;

    public List<ViewTasksBean> viewTasks() {

        return viewtasksDaoImpl.viewTasks();

    }
}
