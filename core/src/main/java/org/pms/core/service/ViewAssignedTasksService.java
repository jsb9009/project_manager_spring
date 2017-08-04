package org.pms.core.service;

import org.pms.orm.model.Employees;
import org.pms.orm.model.Tasks;

import java.util.List;

/**
 * Created by jaliya on 7/26/17.
 */
public interface ViewAssignedTasksService {

//    Tasks chooseEmployeeNo(Tasks tasks);

    List<Tasks> viewassignedTasks(Tasks tasks);

}
