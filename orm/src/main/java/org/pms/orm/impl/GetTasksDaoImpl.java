package org.pms.orm.impl;


import org.pms.orm.dao.GetTasksDao;
import org.pms.orm.model.Tasks;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaliya on 7/28/17.
 */

@Repository
@Transactional
public class GetTasksDaoImpl implements GetTasksDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;


    public List<Tasks> getTasks() {

        String sql = "select task_id from task";

        List<Object> taskObjects = hibernateutilimpl.fetchAll(sql);

        List<Tasks> tasksList = new ArrayList<Tasks>();

        for (Object taskObject : taskObjects) {
            Tasks task = new Tasks();
            String id = (String) taskObject;

            task.setTaskId(id);

            tasksList.add(task);
        }

        return tasksList;
    }
}
