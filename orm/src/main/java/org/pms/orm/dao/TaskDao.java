package org.pms.orm.dao;

import org.pms.orm.model.Task;

/**
 * Created by jaliya on 7/21/17.
 */
public interface TaskDao {

    Long createTask(Task task);
    Task getTask(Long taskId);
}
