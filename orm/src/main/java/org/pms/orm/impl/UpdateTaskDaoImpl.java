package org.pms.orm.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pms.orm.dao.UpdateTaskDao;

import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by jaliya on 7/24/17.
 */

@Repository
@Transactional
public class UpdateTaskDaoImpl implements UpdateTaskDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public void updateTask(Task task) {

        hibernateutilimpl.update(task);

    }

}