package org.pms.orm.impl;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.pms.orm.dao.TaskDao;
import org.pms.orm.model.Employee;
import org.pms.orm.model.Task;

import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by jaliya on 7/21/17.
 */

@Repository
public class TaskDaoImpl extends HibernateUtilImpl implements TaskDao {


    @Override
    public Long createTask(Task task) {
        return (Long) create(task);
    }


    public Task getTask(Long taskId) {

        Session session = getSession();
        Task task1 = null;
        task1 = (Task) session.get(Task.class, taskId);
        Hibernate.initialize(task1);
        return task1;
    }


    public void assignTask(Task task) {

        Session session = getSession();
        Employee employee = session.get(Employee.class, task.getEmployee().getId());
        Task taskDb = session.get(Task.class, task.getId());
        taskDb.setEmployee(employee);
        update(taskDb);

    }

    public List<Task> getTasks() {

        Session session = getSession();
        List<Task> taskList = session.createCriteria(Task.class).list();
        return taskList;
    }


    public void updateTask(Task task) {
        update(task);
    }


    public List<Task> viewassignedTasks(Employee employee) {

        Session session = getSession();
        Criteria cr = session.createCriteria(Task.class);
        cr.add(Restrictions.eq("employee.id", employee.getId()));
        List<Task> taskList = cr.list();
        return taskList;
    }


    public List<Task> viewTasks() {

        Session session = getSession();
        List<Task> taskList = session.createCriteria(Task.class).list();
        return taskList;
    }

    @Override
    public void deleteTask(long id) {
        Task task = new Task();
        task.setId(id);
        delete(task);
    }

}
