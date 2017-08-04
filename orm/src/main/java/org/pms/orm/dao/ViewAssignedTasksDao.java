package org.pms.orm.dao;

import org.pms.orm.model.Employees;
import org.pms.orm.model.Tasks;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */
public interface ViewAssignedTasksDao {

    List<Tasks> viewassignedTasks(Tasks tasks);

}
