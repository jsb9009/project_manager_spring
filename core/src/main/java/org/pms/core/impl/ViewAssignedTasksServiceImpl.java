package org.pms.core.impl;

import org.pms.core.service.ViewAssignedTasksService;
import org.pms.orm.beans.ViewAssignedTasksBean;
import org.pms.orm.impl.ViewAssignedTasksDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class ViewAssignedTasksServiceImpl implements ViewAssignedTasksService {


    @Autowired
    private ViewAssignedTasksDaoImpl viewassignedtasksdaoImpl;


    public String chooseEmployeeNo(String emp_no) {

        viewassignedtasksdaoImpl.chooseEmpoyeeNo(emp_no);

        return emp_no;
    }

    public List<ViewAssignedTasksBean> viewassignedTasks(String indexNo) {

        return viewassignedtasksdaoImpl.viewassignedTasks(indexNo);
    }


}
