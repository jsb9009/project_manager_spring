package org.pms.orm.beans;

/**
 * Created by jaliya on 7/24/17.
 */
public class UpdateTaskBean {


    private String taskNo;

    private String taskStatus;


    public UpdateTaskBean() {
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}
