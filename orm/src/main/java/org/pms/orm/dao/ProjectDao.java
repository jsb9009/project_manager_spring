package org.pms.orm.dao;

import org.pms.orm.model.Project;

/**
 * Created by jaliya on 7/21/17.
 */

public interface ProjectDao {

    Long saveProject(Project project);

    Project getProject(Long projectId);
}


