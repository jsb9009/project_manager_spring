package org.pms.orm.impl;

import org.pms.orm.beans.TaskBean;
import org.pms.orm.beans.ViewTasksBean;
import org.pms.orm.dao.UpdateTaskDao;
import org.pms.orm.beans.UpdateTaskBean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */

@Repository
public class UpdateTaskDaoImpl implements UpdateTaskDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void updateTask(UpdateTaskBean updatetaskBean) {

        String sql = "update task set status=? where task_no=?";


        jdbcTemplate.update(sql, new Object[]
                {updatetaskBean.getTaskStatus(), updatetaskBean.getTaskNo()});

    }


}