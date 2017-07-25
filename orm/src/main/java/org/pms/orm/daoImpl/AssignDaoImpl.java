package org.pms.orm.daoImpl;

import org.pms.orm.AssignDao;
import org.pms.orm.beans.AssignBean;
import org.pms.orm.beans.EmployeeBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by jaliya on 7/21/17.
 */

@Repository
public class AssignDaoImpl implements AssignDao {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void assignTask(AssignBean assignBean) {

        String sql = "update task set index_no_employee=(select index_no from employee where employee_no=?) where task_no=?";


        jdbcTemplate.update(sql, new Object[]
                {assignBean.getEmpNo(),assignBean.getTaskNo()});


    }

}
