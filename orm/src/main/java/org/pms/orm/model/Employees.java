package org.pms.orm.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by jaliya on 8/1/17.
 */

@Entity
@Table(name="employee")
public class Employees implements Serializable {

    private static final long serialVersionUID = -7988799579036225137L;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="login_id")
    private Login login;
//    private List<Login> login;


    @Id
    @Column(name="employee_id")
    private String empId;

    @Column(name="employee_name")
    private String empName;

    @Column(name="employee_position")
    private String position;

    public Employees() {
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
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
