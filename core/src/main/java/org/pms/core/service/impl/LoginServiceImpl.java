package org.pms.core.service.impl;

import org.pms.core.LoginService;
import org.pms.orm.beans.LoginBean;
import org.pms.orm.dao.impl.LoginDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class LoginServiceImpl implements LoginService{


    @Autowired
    private LoginDaoImpl logindaoImpl;

    public int login(LoginBean loginBean){

        return logindaoImpl.login(loginBean);
    }



}
