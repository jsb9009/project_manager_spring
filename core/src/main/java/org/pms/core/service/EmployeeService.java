package org.pms.core.service;


import org.pms.orm.model.Employee;

import java.util.List;


/**
 * Created by jaliya on 7/25/17.
 */

public interface EmployeeService {

     Long addEmployee(Employee employee);
     List<Employee> getEmployees();
//     String getUser(Employee employee);
}
