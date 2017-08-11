package org.pms.orm.impl;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.pms.orm.dao.TaskDao;
import org.pms.orm.model.Employee;
import org.pms.orm.model.Project;
import org.pms.orm.model.Task;
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
public class TaskDaoImpl implements TaskDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;


    @Override
    public Long createTask(Task task) {

        return (Long) hibernateutilimpl.create(task);
    }

    public Task getTask(Long taskId){


        Session session = sessionFactory.openSession();

        Task task1 = null;
        try {
            task1 =  (Task) session.get(Task.class,taskId);
            Hibernate.initialize(task1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

       return task1;

    }


    public void assignTask(Task task) {

        Session session = sessionFactory.openSession();

        Employee employee = session.get(Employee.class, task.getEmployee().getId());
        Task taskDb = session.get(Task.class, task.getId());
        taskDb.setEmployee(employee);

        hibernateutilimpl.update(taskDb);

    }

    public List<Task> getTasks() {

        Session session = sessionFactory.openSession();

        List<Task> taskList = session.createCriteria(Task.class).list();

        return taskList;
    }

    public void updateTask(Task task) {

        hibernateutilimpl.update(task);

    }


    public List<Task> viewassignedTasks(Task task) {

        Session session = sessionFactory.openSession();

        Criteria cr = session.createCriteria(Task.class);
        cr.add(Restrictions.eq("employee.id", task.getEmployee().getId()));
        List<Task> taskList = cr.list();

        return taskList;

    }


    public List<Task> viewTasks() {

        Session session = sessionFactory.openSession();

        List<Task> taskList = session.createCriteria(Task.class).list();

        return taskList;
    }



}
