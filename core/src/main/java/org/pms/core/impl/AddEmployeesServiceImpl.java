package org.pms.core.impl;

import org.pms.core.service.AddEmployeesService;
import org.pms.orm.beans.EmployeeBean;
import org.pms.orm.impl.EmployeeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class AddEmployeesServiceImpl implements AddEmployeesService {

    @Autowired
    private EmployeeDaoImpl employeeDao;

    public void addEmployee(EmployeeBean employeeBean) {

        employeeDao.saveEmployee(employeeBean);


    }


}
