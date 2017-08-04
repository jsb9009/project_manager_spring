package org.pms.orm.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pms.orm.dao.GetEmployeesDao;
import org.pms.orm.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigInteger;
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


    public List<Employees> getEmployees() {

        Session session = sessionFactory.openSession();

        String sql = "select employee_id from employee";

        List<Object> employeeObjects = hibernateutilimpl.fetchAll(sql);

        List<Employees> employeesList = new ArrayList<Employees>();

        for (Object employeeObject : employeeObjects) {
            Employees employee = new Employees();
            String id = (String) employeeObject;

            employee.setEmpId(id);

            employeesList.add(employee);
        }
        return employeesList;
    }

}
