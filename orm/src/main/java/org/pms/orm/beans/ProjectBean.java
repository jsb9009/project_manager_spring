package org.pms.orm.beans;

import java.io.Serializable;

/**
 * Created by jaliya on 7/21/17.
 */
public class ProjectBean implements Serializable {

    private String projectNo;

    private String projectName;

    private String client;

    private String type;

    public ProjectBean() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }


}
