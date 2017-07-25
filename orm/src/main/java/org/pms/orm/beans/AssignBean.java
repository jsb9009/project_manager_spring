package org.pms.orm.beans;

import java.io.Serializable;

/**
 * Created by jaliya on 7/21/17.
 */


public class AssignBean implements Serializable {

    private String empNo;

    private String taskNo;

    public AssignBean() {
    }

    public String getEmpNo() {
        return empNo;
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
}
