package org.pms.service.impl;

import org.pms.AddEmployeesService;
import org.pms.orm.beans.EmployeeBean;
import org.pms.orm.dao.impl.EmployeeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class AddEmployeesServiceImpl implements AddEmployeesService{

    @Autowired
    private EmployeeDaoImpl employeeDaoImpl;

    public void addEmployee(EmployeeBean employeeBean){

        employeeDaoImpl.saveEmployee(employeeBean);


    }


}
