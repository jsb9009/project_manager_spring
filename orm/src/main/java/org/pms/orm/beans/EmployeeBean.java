package org.pms.orm.beans;

import java.io.Serializable;

/**
 * Created by jaliya on 7/19/17.
 */

public class EmployeeBean implements Serializable {

    private static final long serialVersionUID = -1280037900360314186L;

    private String empNo;

    private String empName;

    private String position;

    public EmployeeBean() {

    }


    public String getEmpName() {
        return empName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmpNo() {
        return empNo;
    }



    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}