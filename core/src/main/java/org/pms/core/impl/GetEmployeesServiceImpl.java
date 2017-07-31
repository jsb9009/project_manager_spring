package org.pms.core.impl;

import org.pms.core.service.GetEmployeesService;
import org.pms.orm.beans.EmployeeNumberBean;
import org.pms.orm.impl.GetEmployeesDaoImpl;
import org.pms.orm.impl.GetProjectsDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jaliya on 7/31/17.
 */

@Service
public class GetEmployeesServiceImpl implements GetEmployeesService {


    @Autowired
    private GetEmployeesDaoImpl getemployeesdao;


    public List<EmployeeNumberBean> getEmployees(){


        return getemployeesdao.getEmployees();

    }
}
