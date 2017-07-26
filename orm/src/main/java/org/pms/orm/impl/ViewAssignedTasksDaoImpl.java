package org.pms.orm.impl;

import org.pms.orm.dao.ViewAssignedTasksDao;
import org.pms.orm.beans.ViewAssignedTasksBean;
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
public class ViewAssignedTasksDaoImpl implements ViewAssignedTasksDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String chooseEmpoyeeNo(String emp_no) {

        String sql1 = "select index_no from employee where employee_no=?";

        String indexNo = jdbcTemplate.queryForObject(
                sql1, new Object[]{emp_no}, String.class);
        return indexNo;

    }


    public List<ViewAssignedTasksBean> viewassignedTasks(String emp_no) {
        String indexNo = chooseEmpoyeeNo(emp_no);

        String sql2 = "select task_no,task_name,project_no,no_of_hours from task,project,employee where task.index_no_project=project.index_no and task.index_no_employee=employee.index_no and index_no_employee=?";

        List<ViewAssignedTasksBean> tasksList1 = jdbcTemplate.query(sql2, new Object[]{indexNo}, new ResultSetExtractor<List<ViewAssignedTasksBean>>() {
            @Override
            public List<ViewAssignedTasksBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<ViewAssignedTasksBean> list1 = new ArrayList<ViewAssignedTasksBean>();
                while (rs.next()) {
                    ViewAssignedTasksBean chooseemployeeBean = new ViewAssignedTasksBean();
                    chooseemployeeBean.setTask_number(rs.getString(1));
                    chooseemployeeBean.setTask_name(rs.getString(2));
                    chooseemployeeBean.setNo_of_hours(rs.getString(3));
                    chooseemployeeBean.setProject_number(rs.getString(4));

                    list1.add(chooseemployeeBean);
                }
                return list1;
            }
        });

        return tasksList1;
    }

}
