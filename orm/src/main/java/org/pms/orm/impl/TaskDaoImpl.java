package org.pms.orm.impl;

import org.pms.orm.dao.TaskDao;
import org.pms.orm.model.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jaliya on 7/21/17.
 */

@Repository
@Transactional
public class TaskDaoImpl implements TaskDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;


    @Override
    public String createTask(Tasks tasks) {

        return (String) hibernateutilimpl.create(tasks);
    }

}
