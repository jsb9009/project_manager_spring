package org.pms.orm.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jaliya on 8/1/17.
 */


@Entity
@Table(name="project")
public class Project implements Serializable {

    private static final long serialVersionUID = -7988799579036225137L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="project_id", nullable = false)
    private String projectId;

    @Column(name="project_name")
    private String projectName;

    @Column(name="client")
    private String client;

    @Column(name="project_type")
    private String projectType;

    public Project() {
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
