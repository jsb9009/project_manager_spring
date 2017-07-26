package org.pms.core;

import org.pms.orm.beans.ViewAssignedTasksBean;

import java.util.List;

/**
 * Created by jaliya on 7/26/17.
 */
public interface ViewAssignedTasksService {

    String chooseEmployeeNo(String indexNo);

    List<ViewAssignedTasksBean> viewassignedTasks(String indexNo);

}
