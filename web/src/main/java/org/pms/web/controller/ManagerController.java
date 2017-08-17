package org.pms.web.controller;

import org.pms.orm.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jaliya on 8/17/17.
 */

@Controller
public class ManagerController {

    @RequestMapping("/go_to_login")
    public ModelAndView redirect(Model model) {
        model.addAttribute("employee", new Employee());
        return new ModelAndView("login");
    }

}
