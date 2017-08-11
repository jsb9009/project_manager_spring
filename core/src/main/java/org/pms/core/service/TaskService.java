package org.pms.core.service;


import org.pms.orm.model.Task;

import java.util.List;

/**
 * Created by jaliya on 7/26/17.
 */
public interface TaskService {

     void assignTask(Task task);
     List<Task> getTasks();
     void updateTask(Task task);
     List<Task> viewassignedTasks(Task task);
     List<Task> viewTasks();
     Long createTasks(Task task);

}
