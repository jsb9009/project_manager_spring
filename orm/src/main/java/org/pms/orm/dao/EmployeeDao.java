package org.pms.orm.dao;

import org.pms.orm.model.Employee;
import java.util.List;

/**
 * Created by jaliya on 7/21/17.
 */

public interface EmployeeDao {

    Long saveEmployee(Employee employee);

    public void deleteEmployee(long id);

    Employee getEmployee(Long empId);

    List<Employee> getEmployees();

    Employee getUser(Employee employee);
}
