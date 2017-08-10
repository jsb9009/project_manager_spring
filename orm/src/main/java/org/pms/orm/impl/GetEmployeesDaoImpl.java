package org.pms.orm.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pms.orm.dao.GetEmployeesDao;
import org.pms.orm.model.Employee;
import org.pms.orm.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaliya on 7/31/17.
 */

@Repository
@Transactional
public class GetEmployeesDaoImpl implements GetEmployeesDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;


    public List<Employee> getEmployees() {

        Session session = sessionFactory.openSession();

        List<Employee> employeeList = session.createCriteria(Employee.class).list();

        return employeeList;
    }

}
