package org.pms.orm;

import org.pms.orm.beans.EmployeeBean;
import org.pms.orm.beans.ProjectBean;

/**
 * Created by jaliya on 7/21/17.
 */

public interface ProjectDao {

    void saveProject(ProjectBean projectBean);
}


