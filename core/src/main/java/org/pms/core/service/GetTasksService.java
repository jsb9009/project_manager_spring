package org.pms.core.service;

import org.pms.orm.model.Task;

import java.util.List;

/**
 * Created by jaliya on 7/28/17.
 */
public interface GetTasksService {

    List<Task> getTasks();
}
