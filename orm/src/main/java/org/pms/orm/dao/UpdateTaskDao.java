package org.pms.orm.dao;

import org.pms.orm.beans.UpdateTaskBean;
import org.pms.orm.beans.ViewTasksBean;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */
public interface UpdateTaskDao {

    void updateTask(UpdateTaskBean updatetaskBean);

}
