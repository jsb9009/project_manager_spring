package org.pms.orm.dao;

import org.pms.orm.model.Employee;

/**
 * Created by jaliya on 7/21/17.
 */

public interface EmployeeDao {

    Long saveEmployee(Employee employee);

    Employee getEmployee(Long empId);

}
