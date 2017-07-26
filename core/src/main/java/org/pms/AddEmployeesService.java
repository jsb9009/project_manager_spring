package org.pms;

import org.pms.orm.beans.EmployeeBean;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/25/17.
 */


public interface AddEmployeesService {

    public void addEmployee(EmployeeBean employeeBean);
}
