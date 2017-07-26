package org.pms.orm.beans;

import java.io.Serializable;

/**
 * Created by jaliya on 7/21/17.
 */
public class TaskBean implements Serializable {

    private String project_no;

    private String task_no;


    private String task_name;

    private String status;

    private String no_of_hours;


    public TaskBean() {
    }


    public String getProject_no() {
        return project_no;
    }

    public void setProject_no(String project_no) {
        this.project_no = project_no;
    }

    public String getTask_no() {
        return task_no;
    }

    public String getTask_name() {
        return task_name;
    }

    public String getNo_of_hours() {
        return no_of_hours;
    }

    public String getStatus() {
        return status;
    }


    public void setTask_no(String task_no) {
        this.task_no = task_no;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNo_of_hours(String no_of_hours) {
        this.no_of_hours = no_of_hours;
    }

}
