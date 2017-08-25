package org.pms.web.controller;

import org.pms.core.service.EmployeeService;
import org.pms.core.util.LoggedUser;
import org.pms.orm.dao.EmployeeDao;
import org.pms.orm.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaliya on 7/20/17.
 */

@Controller
public class AddEmployeesController {


    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeDao employeeDao;


    @RequestMapping("/add_employees")
    public String add_employees(Model model2, ModelMap model) {
        model2.addAttribute("employee", new Employee());
        List employeeList = employeeService.getEmployees();
        model.put("employeeList", employeeList);
        return "add_employees";
    }

    @RequestMapping(value = "/addemployee", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee, ModelMap model) {

        employeeService.addEmployee(employee);
        model.put("sucessMsg", "Employee Sucessfully added");
        return "redirect:/add_employees";
    }

    @ModelAttribute("authenticationList")
    public List<String> getAuthenticationList(Model model) {
        List<String> authenticationList = new ArrayList<String>();
        authenticationList.add("Manager");
        authenticationList.add("Supervisor");
        authenticationList.add("Employee");

        return authenticationList;
    }

    @RequestMapping("deleteEmployee")
    public ModelAndView deleteEmployee(@RequestParam long id) {
        employeeService.deleteEmployee(id);
        return new ModelAndView("redirect:/add_employees");
    }

    @RequestMapping("/go_to_manager_direct")
    public ModelAndView redirect(Model model) {
        model.addAttribute("user", LoggedUser.loggedEmployee.getEmpName());
        return new ModelAndView("manager_direct");
    }

}