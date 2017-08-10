package org.pms.core.service;

import org.pms.orm.model.Employee;

import java.util.List;

/**
 * Created by jaliya on 7/31/17.
 */
public interface GetEmployeesService {

    List<Employee> getEmployees();
}
