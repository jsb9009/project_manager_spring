package org.pms.core.impl;

import org.pms.core.service.LoginService;

import org.pms.orm.dao.LoginDao;

import org.pms.orm.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jaliya on 7/26/17.
 */

@Service
@Transactional
public class LoginServiceImpl implements LoginService {


    @Autowired
    private LoginDao logindao;

    public String login(Login login){

        return logindao.login(login);
    }


}
