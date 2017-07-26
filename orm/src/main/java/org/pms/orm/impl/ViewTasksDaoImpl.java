package org.pms.orm.impl;

import org.pms.orm.dao.ViewTasksDao;
import org.pms.orm.beans.ViewTasksBean;
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
public class ViewTasksDaoImpl implements ViewTasksDao {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ViewTasksBean> viewTasks() {
        String sql = "select task_no,task_name,status,project_no,employee_no from task,project,employee where task.index_no_project=project.index_no and task.index_no_employee=employee.index_no";

        List<ViewTasksBean> tasksList = jdbcTemplate.query(sql, new ResultSetExtractor<List<ViewTasksBean>>() {
            @Override
            public List<ViewTasksBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<ViewTasksBean> list = new ArrayList<ViewTasksBean>();
                while (rs.next()) {
                    ViewTasksBean viewtasksBean = new ViewTasksBean();
                    viewtasksBean.setTask_no(rs.getString(1));
                    viewtasksBean.setTask_name(rs.getString(2));
                    viewtasksBean.setStatus(rs.getString(3));
                    viewtasksBean.setProjectNo(rs.getString(4));
                    viewtasksBean.setEmpNo(rs.getString(5));
                    list.add(viewtasksBean);
                }
                return list;
            }
        });
        return tasksList;

    }

}


