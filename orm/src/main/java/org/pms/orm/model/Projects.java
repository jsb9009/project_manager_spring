package org.pms.orm.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jaliya on 8/1/17.
 */


@Entity
@Table(name="project")
public class Projects implements Serializable {

    private static final long serialVersionUID = -7988799579036225137L;

    @Id
    @Column(name="project_id")
    private String projectId;

    @Column(name="project_name")
    private String projectName;

    @Column(name="client")
    private String client;

    @Column(name="project_type")
    private String projectType;

    public Projects() {
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }
}
