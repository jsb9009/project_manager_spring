package org.pms.web.controller;


import org.pms.core.service.LoginService;
import org.pms.core.util.LoggedUser;
import org.pms.orm.dao.EmployeeDao;
import org.pms.orm.model.Employee;
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

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private LoggedUser loggedUser;

    @RequestMapping(value = "/loginin", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("employee") Employee employee, Model model) {

        String rs = loginService.login(employee);

        loggedUser.setLoggedEmployee(employeeDao.getUser(employee));

        if (rs.equals("Manager")) {

            model.addAttribute("user", LoggedUser.loggedEmployee.getEmpName());
            return new ModelAndView("manager_direct");
        } else if (rs.equals("Supervisor")) {

            model.addAttribute("user", LoggedUser.loggedEmployee.getEmpName());
            return new ModelAndView("supervisor_direct");
        } else if (rs.equals("Employee")) {

            model.addAttribute("user", LoggedUser.loggedEmployee.getEmpName());
            return new ModelAndView("employee_direct");
        } else {
            
            model.addAttribute("msg", "Invalid username or password.");
            return new ModelAndView("error");
        }

    }

}

