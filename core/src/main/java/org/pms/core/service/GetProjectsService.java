package org.pms.core.service;

import org.pms.orm.beans.GetProjectsBean;
import org.pms.orm.beans.GetTasksBean;

import java.util.List;

/**
 * Created by jaliya on 7/31/17.
 */

public interface GetProjectsService {


    List<GetProjectsBean> getProjects();

}
