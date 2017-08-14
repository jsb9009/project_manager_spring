package org.pms.web.controller;

/**
 * Created by jaliya on 7/18/17.
 */

import org.pms.orm.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model m) {
        m.addAttribute("employee", new Employee());
        return "login";
    }

}
