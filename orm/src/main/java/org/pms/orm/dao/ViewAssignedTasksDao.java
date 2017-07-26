package org.pms.orm.dao;

import org.pms.orm.beans.ViewAssignedTasksBean;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */
public interface ViewAssignedTasksDao {


    String chooseEmpoyeeNo(String emp_no);

    List<ViewAssignedTasksBean> viewassignedTasks(String indexNo);
}
