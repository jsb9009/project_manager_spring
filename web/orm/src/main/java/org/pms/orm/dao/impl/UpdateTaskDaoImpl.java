package org.pms.orm.dao.impl;

import org.pms.orm.UpdateTaskDao;
import org.pms.orm.beans.AssignBean;
import org.pms.orm.beans.UpdateTaskBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
