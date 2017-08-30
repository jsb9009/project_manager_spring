package org.pms.web.controller;

import org.pms.core.util.LoggedUser;
import org.pms.orm.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jaliya on 8/17/17.
 */

@Controller
public class EmployeeController {

    @RequestMapping("/logout")
    public ModelAndView redirect(Model model) {
        model.addAttribute("employee", new Employee());
        LoggedUser.loggedEmployee= new Employee();
        return new ModelAndView("login");
    }
}
