package org.pms.orm.dao.impl;

import org.pms.orm.EmployeeDao;
import org.pms.orm.beans.EmployeeBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by jaliya on 7/21/17.
 */


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveEmployee(EmployeeBean employeeBean) {

        String sql = "insert into employee(employee_no, employee_name, position) values(?,?,?)";

        jdbcTemplate.update(sql, new Object[]
                {employeeBean.getEmpNo(), employeeBean.getEmpName(), employeeBean.getPosition()});

    }
}