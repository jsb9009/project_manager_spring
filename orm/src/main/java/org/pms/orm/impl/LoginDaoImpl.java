package org.pms.orm.impl;

import org.pms.orm.beans.LoginBean;
import org.pms.orm.dao.LoginDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by jaliya on 7/26/17.
 */

@Repository
public class LoginDaoImpl implements LoginDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int login(LoginBean loginBean) {


        String sql = "select index_no from login where username=? and password=?";


        int rs = jdbcTemplate.queryForObject(
                sql, new Object[]{loginBean.getUsername(), loginBean.getPassword()}, int.class);

        return rs;
    }
}
