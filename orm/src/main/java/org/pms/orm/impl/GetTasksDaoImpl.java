package org.pms.orm.impl;

import org.pms.orm.beans.GetTasksBean;
import org.pms.orm.dao.GetTasksDao;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaliya on 7/28/17.
 */

@Repository
public class GetTasksDaoImpl implements GetTasksDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<GetTasksBean> getTasks() {

        String sql = "select task_no from task";

        List<GetTasksBean> tasksList = jdbcTemplate.query(sql, new ResultSetExtractor<List<GetTasksBean>>() {

            @Override
            public List<GetTasksBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<GetTasksBean> list = new ArrayList<GetTasksBean>();
                while (rs.next()) {

                    GetTasksBean  gettasksBean = new GetTasksBean();
                    gettasksBean.setTask_no(rs.getString(1));
                    list.add(gettasksBean);
                }
                return list;
            }
        });
        return tasksList;
    }
}
