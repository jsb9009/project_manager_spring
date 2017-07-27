package org.pms.core.impl;

import org.pms.core.service.LoginService;
import org.pms.orm.beans.LoginBean;
import org.pms.orm.impl.LoginDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    private LoginDaoImpl logindao;

    public int login(LoginBean loginBean){

        return logindao.login(loginBean);
    }



}
