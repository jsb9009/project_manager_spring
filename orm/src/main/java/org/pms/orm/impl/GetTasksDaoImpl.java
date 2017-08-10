package org.pms.orm.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pms.orm.dao.GetTasksDao;
import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jaliya on 7/28/17.
 */

@Repository
@Transactional
public class GetTasksDaoImpl implements GetTasksDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public List<Task> getTasks() {

        Session session = sessionFactory.openSession();

        List<Task> taskList = session.createCriteria(Task.class).list();

        return taskList;
    }
}
