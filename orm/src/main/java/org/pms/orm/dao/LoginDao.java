package org.pms.orm.dao;

import org.pms.orm.beans.LoginBean;

/**
 * Created by jaliya on 7/26/17.
 */


public interface LoginDao {

    int login(LoginBean loginBean);
}
