package org.pms.orm.daoImpl;

import org.pms.orm.ChooseEmployeeDao;
import org.pms.orm.beans.AssignBean;
import org.pms.orm.beans.ChooseEmployeeBean;
import org.pms.orm.beans.EmployeeBean;
import org.pms.orm.beans.ViewTasksBean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */

@Repository
public class ChooseEmployeeDaoImpl implements ChooseEmployeeDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
       this.jdbcTemplate = jdbcTemplate;
   }


    public String chooseEmpoyeeNo(String emp_no) {

//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        String sql1 = "select index_no from employee where employee_no=?";


        String indexNo = jdbcTemplate.queryForObject(
                sql1, new Object[] { emp_no }, String.class);
        return indexNo;

    }



    public List<ChooseEmployeeBean> viewassignedTasks(String emp_no){
        String indexNo = chooseEmpoyeeNo(emp_no);
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        String sql2 = "select task_no,task_name,project_no,no_of_hours from task,project,employee where task.index_no_project=project.index_no and task.index_no_employee=employee.index_no and index_no_employee=?";


//        JdbcTemplate.queryForObject(sql2, new Object[] {indexNo}, String.class);


//        jdbcTemplate.queryForObject(sql2, new Object[]
//                {indexNo});

        List<ChooseEmployeeBean> tasksList1 = jdbcTemplate.query(sql2,new Object[] {indexNo}, new ResultSetExtractor<List<ChooseEmployeeBean>>()
        {
            @Override
            public List<ChooseEmployeeBean> extractData(ResultSet rs) throws SQLException, DataAccessException
            {
                List<ChooseEmployeeBean> list1 = new ArrayList<ChooseEmployeeBean>();
                while (rs.next())
                {
                    ChooseEmployeeBean chooseemployeeBean = new ChooseEmployeeBean();
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
