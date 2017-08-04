package org.pms.orm.impl;

import org.pms.orm.dao.EmployeeDao;
import org.pms.orm.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jaliya on 7/21/17.
 */


@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Override
    public String saveEmployee(Employees employees) {

        return (String) hibernateutilimpl.create(employees);
    }
}