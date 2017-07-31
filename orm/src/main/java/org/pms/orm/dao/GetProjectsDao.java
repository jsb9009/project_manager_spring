package org.pms.orm.dao;

import org.pms.orm.beans.GetProjectsBean;
import org.pms.orm.beans.GetTasksBean;

import java.util.List;

/**
 * Created by jaliya on 7/31/17.
 */
public interface GetProjectsDao {

    List<GetProjectsBean> getProjects();
}
