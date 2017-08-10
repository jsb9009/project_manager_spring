package org.pms.orm.dao;

import org.pms.orm.model.Task;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */
public interface ViewAssignedTasksDao {

    List<Task> viewassignedTasks(Task task);

}
