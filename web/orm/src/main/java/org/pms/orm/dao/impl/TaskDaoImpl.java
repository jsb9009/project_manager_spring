package org.pms.orm.dao.impl;

import org.pms.orm.TaskDao;
import org.pms.orm.beans.ProjectBean;
import org.pms.orm.beans.TaskBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by jaliya on 7/21/17.
 */

@Repository
public class TaskDaoImpl implements TaskDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createTask(TaskBean taskBean) {

        String sql1 = "insert into task(task_no,task_name,status,no_of_hours) values(?,?,?,?)";

        jdbcTemplate.update(sql1, new Object[]
                {taskBean.getTask_no(),taskBean.getTask_name(),taskBean.getStatus(), taskBean.getNo_of_hours()});

        String sql2 = "update task set index_no_project=(select index_no from project where project_no=?) where task_no=?";
        jdbcTemplate.update(sql2, new Object[]
                {taskBean.getProject_no(),taskBean.getTask_no()});

    }

}
