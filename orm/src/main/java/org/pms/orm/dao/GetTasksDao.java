package org.pms.orm.dao;

import org.pms.orm.beans.GetTasksBean;
import org.pms.orm.beans.UpdateTaskBean;

import java.util.List;

/**
 * Created by jaliya on 7/28/17.
 */
public interface GetTasksDao {

    List<GetTasksBean> getTasks();
}
