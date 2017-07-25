package org.pms.orm.daoImpl;

import org.pms.orm.ProjectDao;
import org.pms.orm.beans.EmployeeBean;
import org.pms.orm.beans.ProjectBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by jaliya on 7/21/17.
 */

@Repository
public class ProjectDaoImpl implements ProjectDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveProject(ProjectBean projectBean) {

        String sql = "insert into project(project_no, project_name, client,project_type) values(?,?,?,?)";

        jdbcTemplate.update(sql, new Object[]
                {projectBean.getProjectNo(),projectBean.getProjectName(),projectBean.getClient(), projectBean.getType()});

    }

}
