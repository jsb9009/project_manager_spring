package org.pms.orm.dao;

import org.pms.orm.model.Employees;

import java.util.List;

/**
 * Created by jaliya on 7/31/17.
 */
public interface GetEmployeesDao {

    List<Employees> getEmployees();
}
