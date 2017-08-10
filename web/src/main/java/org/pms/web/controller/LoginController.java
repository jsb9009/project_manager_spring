package org.pms.web.controller;

import org.pms.core.service.LoginService;
import org.pms.orm.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jaliya on 7/20/17.
 */

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/loginin", method = RequestMethod.POST)
    public ModelAndView assignTask(@ModelAttribute("loginBean") Login login, Model model) {

        String rs = loginService.login(login);

        int result = Integer.parseInt(rs);

        if (result == 1) {
            model.addAttribute("msg", "welcome manager");
            return new ModelAndView("manager_direct");
        } else if (result == 3) {
            model.addAttribute("msg", "welcome manager");
            return new ModelAndView("supervisor_direct");
        } else if (result == 4) {
            model.addAttribute("msg", "welcome manager");
            return new ModelAndView("employee_direct");
        } else
            return new ModelAndView("error_page");
    }

    }

