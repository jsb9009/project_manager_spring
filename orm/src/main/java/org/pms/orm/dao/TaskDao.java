package org.pms.orm.dao;

import org.pms.orm.model.Employee;
import org.pms.orm.model.Task;
import java.util.List;

/**
 * Created by jaliya on 7/21/17.
 */
public interface TaskDao {

    Long createTask(Task task);
    Task getTask(Long taskId);
    void assignTask(Task task);
    List<Task> getTasks();
    void updateTask(Task task);
    List<Task> viewassignedTasks(Employee employee);
    List<Task> viewTasks();
    public void deleteTask(long id);

}
