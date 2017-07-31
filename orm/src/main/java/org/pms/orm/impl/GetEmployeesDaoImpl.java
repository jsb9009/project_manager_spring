package org.pms.orm.impl;

import org.pms.orm.beans.EmployeeNumberBean;
import org.pms.orm.dao.GetEmployeesDao;
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
public class GetEmployeesDaoImpl implements GetEmployeesDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<EmployeeNumberBean> getEmployees() {

        String sql = "select employee_no from employee";

        List<EmployeeNumberBean> employeesList = jdbcTemplate.query(sql, new ResultSetExtractor<List<EmployeeNumberBean>>() {

            @Override
            public List<EmployeeNumberBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<EmployeeNumberBean> list = new ArrayList<EmployeeNumberBean>();
                while (rs.next()) {

                    EmployeeNumberBean  employeenumberBean = new EmployeeNumberBean();
                    employeenumberBean.setEmp_no(rs.getString(1));
                    list.add(employeenumberBean);
                }
                return list;
            }
        });
        return employeesList;
    }

}
