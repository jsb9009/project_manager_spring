package org.pms.orm.impl;

import org.pms.orm.beans.GetProjectsBean;
import org.pms.orm.beans.GetTasksBean;
import org.pms.orm.dao.GetProjectsDao;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaliya on 7/31/17.
 */

@Repository
public class GetProjectsDaoImpl implements GetProjectsDao {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<GetProjectsBean> getProjects() {

        String sql = "select project_no from project";

        List<GetProjectsBean> projectsList = jdbcTemplate.query(sql, new ResultSetExtractor<List<GetProjectsBean>>() {

            @Override
            public List<GetProjectsBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<GetProjectsBean> list = new ArrayList<GetProjectsBean>();
                while (rs.next()) {

                    GetProjectsBean  getprojectsBean = new GetProjectsBean();
                    getprojectsBean.setProjectNo(rs.getString(1));
                    list.add(getprojectsBean);
                }
                return list;
            }
        });
        return projectsList;
    }

}
