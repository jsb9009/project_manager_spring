package org.pms.orm.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jaliya on 8/1/17.
 */

@Entity
@Table(name="task")
public class Task implements Serializable {

    private static final long serialVersionUID = -7988799579036225137L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="employee_id")
    private Employee employee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="project_id")
    private Project project;

    @Column(name="task_id")
    private String taskId;

    @Column(name="task_name")
    private String taskName;

    @Column(name="status")
    private String status;


    @Column(name="no_of_hours")
    private String noOfHours;

    public Task() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
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
