package org.pms.orm.model;


import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by jaliya on 8/1/17.
 */

@Entity
@Table(name="employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = -7988799579036225137L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="employee_id")
    private String empId;

    @Column(name="employee_name")
    private String empName;

    @Column
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column
    private String password;

    @Column(name="authentication_level")
    private String authinticationLevel;

    public String getAuthinticationLevel() {
        return authinticationLevel;
    }

    public void setAuthinticationLevel(String authinticationLevel) {
        this.authinticationLevel = authinticationLevel;
    }

    @Column(name="employee_position")
    private String position;

    public Employee() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
