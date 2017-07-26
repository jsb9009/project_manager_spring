package org.pms.orm;

import org.pms.orm.beans.ViewTasksBean;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */
public interface ViewTasksDao {

    List<ViewTasksBean> viewTasks();

}
