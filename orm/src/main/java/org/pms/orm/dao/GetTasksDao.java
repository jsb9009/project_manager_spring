package org.pms.orm.dao;

import org.pms.orm.model.Tasks;

import java.util.List;

/**
 * Created by jaliya on 7/28/17.
 */
public interface GetTasksDao {

    List<Tasks> getTasks();
}
