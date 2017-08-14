package org.pms.orm.impl;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.pms.orm.dao.EmployeeDao;
import org.pms.orm.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jaliya on 7/21/17.
 */


@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    @Override
    public Long saveEmployee(Employee employee) {

        return (Long) hibernateutilimpl.create(employee);
    }


    public Employee getEmployee(Long empId) {

        Session session = sessionFactory.openSession();

        Employee employee1 = null;
        try {
            employee1 = (Employee) session.get(Employee.class, empId);
            Hibernate.initialize(employee1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return employee1;
    }


    public List<Employee> getEmployees() {

        Session session = sessionFactory.openSession();

        List<Employee> employeeList = session.createCriteria(Employee.class).list();

        return employeeList;
    }


    public Employee getUser(Employee employee) {


        Session session = sessionFactory.openSession();

        Criteria cr = session.createCriteria(Employee.class);
        cr.add(Restrictions.eq("username", employee.getUsername()));
        Employee employee1 = (Employee) cr.uniqueResult();

        return employee1;
    }

}