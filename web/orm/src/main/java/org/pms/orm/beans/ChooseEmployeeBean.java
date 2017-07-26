package org.pms.orm.beans;

/**
 * Created by jaliya on 7/24/17.
 */
public class ChooseEmployeeBean {


    private String task_number;

    private String task_name;

    private String no_of_hours;

    private String project_number;

    public ChooseEmployeeBean() {
    }


    public String getTask_number() {
        return task_number;
    }

    public void setTask_number(String task_number) {
        this.task_number = task_number;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(String no_of_hours) {
        this.no_of_hours = no_of_hours;
    }

    public String getProject_number() {
        return project_number;
    }

    public void setProject_number(String project_number) {
        this.project_number = project_number;
    }
}
