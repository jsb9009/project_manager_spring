package org.pms.orm.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.pms.orm.dao.ViewAssignedTasksDao;

import org.pms.orm.model.Employee;
import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.*;
import javax.persistence.criteria.*;
import javax.persistence.metamodel.Metamodel;

import java.util.List;
import java.util.Map;

/**
 * Created by jaliya on 7/24/17.
 */

@Repository
@Transactional
public class ViewAssignedTasksDaoImpl implements ViewAssignedTasksDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;


    public List<Task> viewassignedTasks(Task task) {

        Session session = sessionFactory.openSession();

        Criteria cr = session.createCriteria(Task.class);
        cr.add(Restrictions.eq("employee.id", task.getEmployee().getId()));
        List<Task> taskList = cr.list();

        return taskList;

    }

}