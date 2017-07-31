package org.pms.core.service;

import org.pms.orm.beans.GetTasksBean;
import org.pms.orm.beans.TaskBean;

import java.util.List;

/**
 * Created by jaliya on 7/28/17.
 */
public interface GetTasksService {

    List<GetTasksBean> getTasks();
}
