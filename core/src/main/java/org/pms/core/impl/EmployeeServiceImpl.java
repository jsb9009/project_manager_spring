package org.pms.core.impl;

import org.pms.core.service.EmployeeService;

import org.pms.orm.dao.EmployeeDao;

import org.pms.orm.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;


    public Long addEmployee(Employee employee) {

       return employeeDao.saveEmployee(employee);

    }

    public List<Employee> getEmployees(){

        return employeeDao.getEmployees();

    }

}
