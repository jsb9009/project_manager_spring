package org.pms.core;

import org.pms.core.service.AddEmployeesService;
import org.pms.orm.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jaliya on 7/20/17.
 */

@Controller
public class AddEmployeesController {


    @Autowired
    private AddEmployeesService addemployeesService;

    @RequestMapping("/add_employees")
    public String add_employees(Model model2) {
        model2.addAttribute("employees", new Employees());
        return "add_employees";
    }

    @RequestMapping(value = "/addemployee", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employees") Employees employees, ModelMap model) {

        addemployeesService.addEmployee(employees);
        model.put("sucessMsg", "Employee Sucessfully added");
        return "/add_employees";
    }

}
