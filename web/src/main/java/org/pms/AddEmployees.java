package org.pms;

import org.pms.orm.EmployeeDao;
import org.pms.orm.beans.EmployeeBean;
import org.pms.orm.daoImpl.EmployeeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by jaliya on 7/20/17.
 */

@Controller
public class AddEmployees {

    @Autowired
    private EmployeeDaoImpl employeeDaoImpl;


    @RequestMapping("/add_employees")
    public String add_employees(Model model2) {
        model2.addAttribute("employeeBean", new EmployeeBean());
        return "add_employees";
    }

    @RequestMapping(value = "/addemployee",method=RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employeeBean") EmployeeBean employeeBean, ModelMap model){


        employeeDaoImpl.saveEmployee(employeeBean);
        model.put("sucessMsg","Sucessfully inserted");
        return "/add_employees";
    }

}
