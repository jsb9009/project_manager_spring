package org.pms.orm.impl;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.pms.orm.dao.EmployeeDao;
import org.pms.orm.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jaliya on 7/21/17.
 */


@Repository
public class EmployeeDaoImpl extends HibernateUtilImpl implements EmployeeDao {


    @Override
    public Long saveEmployee(Employee employee) {

        return (Long) create(employee);
    }


    public Employee getEmployee(Long empId) {

        Session session = getSession();
        Employee employee1 = null;

        employee1 = (Employee) session.get(Employee.class, empId);
        Hibernate.initialize(employee1);

        return employee1;
    }


    public List<Employee> getEmployees() {

        Session session = getSession();

        List<Employee> employeeList = session.createCriteria(Employee.class).list();

        return employeeList;
    }


    public Employee getUser(Employee employee) {


        Session session = getSession();

        Criteria cr = session.createCriteria(Employee.class);
        cr.add(Restrictions.eq("username", employee.getUsername()));
        Employee employee1 = (Employee) cr.uniqueResult();

        return employee1;
    }


    @Override
    public void deleteEmployee(long id) {
        Employee employee = new Employee();
        employee.setId(id);
        delete(employee);
    }

}