package org.pms.orm.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by jaliya on 8/1/17.
 */

@Entity
@Table(name="task")
public class Tasks implements Serializable {

    private static final long serialVersionUID = -7988799579036225137L;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="employee_id")
    private Employees employees;
//    private List<Employees> employees;

//

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="project_id")
    private Projects projects;
//    private List<Projects> projects;


    @Id
    @Column(name="task_id")
    private String taskId;

    @Column(name="task_name")
    private String taskName;

    @Column(name="status")
    private String status;


    @Column(name="no_of_hours")
    private String noOfHours;

    public Tasks() {
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(String noOfHours) {
        this.noOfHours = noOfHours;
    }
}
