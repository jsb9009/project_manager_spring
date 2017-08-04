package org.pms.orm.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pms.orm.dao.AssignDao;
import org.pms.orm.model.Employees;
import org.pms.orm.model.Tasks;
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

    public void assignTask(Tasks tasks) {

        Session session = sessionFactory.openSession();

        Employees employee = session.get(Employees.class, tasks.getEmployees().getEmpId());
        Tasks taskDb = session.get(Tasks.class, tasks.getTaskId());
        taskDb.setEmployees(employee);

        hibernateutilimpl.update(taskDb);

    }

}
