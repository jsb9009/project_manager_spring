package org.pms.core.service;

import org.pms.orm.beans.TaskBean;
import org.pms.orm.beans.UpdateTaskBean;
import org.pms.orm.beans.ViewTasksBean;

import java.util.List;

/**
 * Created by jaliya on 7/26/17.
 */
public interface UpdateTaskService {

    void updateTask(UpdateTaskBean updatetaskBean);

}
