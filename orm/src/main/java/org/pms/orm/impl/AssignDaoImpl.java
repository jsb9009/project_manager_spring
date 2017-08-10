package org.pms.orm.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pms.orm.dao.AssignDao;
import org.pms.orm.model.Employee;
import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by jaliya on 7/21/17.
 */

@Repository
@Transactional
public class AssignDaoImpl implements AssignDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public void assignTask(Task task) {

        Session session = sessionFactory.openSession();

        Employee employee = session.get(Employee.class, task.getEmployee().getId());
        Task taskDb = session.get(Task.class, task.getId());
        taskDb.setEmployee(employee);

        hibernateutilimpl.update(taskDb);

    }

}
