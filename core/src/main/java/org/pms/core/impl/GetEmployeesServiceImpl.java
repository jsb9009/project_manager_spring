package org.pms.core.impl;

import org.pms.core.service.GetEmployeesService;
import org.pms.orm.dao.GetEmployeesDao;
import org.pms.orm.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jaliya on 7/31/17.
 */

@Service
@Transactional
public class GetEmployeesServiceImpl implements GetEmployeesService {


    @Autowired
    private GetEmployeesDao getemployeesdao;


    public List<Employees> getEmployees(){


        return getemployeesdao.getEmployees();

    }
}
