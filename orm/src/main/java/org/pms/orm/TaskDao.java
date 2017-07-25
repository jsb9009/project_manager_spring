package org.pms.orm;

import org.pms.orm.beans.ProjectBean;
import org.pms.orm.beans.TaskBean;

/**
 * Created by jaliya on 7/21/17.
 */
public interface TaskDao {

    public void createTask(TaskBean taskBean);
}
