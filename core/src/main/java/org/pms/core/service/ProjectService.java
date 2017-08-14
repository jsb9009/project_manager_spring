package org.pms.core.service;


import org.pms.orm.model.Project;
import java.util.List;

/**
 * Created by jaliya on 7/26/17.
 */

public interface ProjectService {

     Long addProjects(Project project);
     List<Project> getProjects();
}
