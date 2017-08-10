package org.pms.orm.impl;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pms.orm.dao.TaskDao;
import org.pms.orm.model.Project;
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

}
