package org.pms.web.controller;

import org.pms.core.service.EmployeeService;
import org.pms.core.service.TaskService;
import org.pms.orm.model.Employee;
import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */

@Controller
public class ViewAssignedTasksController {


    @Autowired
    private TaskService taskService;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/view_assigned_tasks_list")
    public String projects(Model model7) {
        model7.addAttribute("task", new Task());
        return "employee_choose";
    }


    @RequestMapping(value = "/view_assigned_tasks", method = RequestMethod.GET)
    public String viewassignedTasks(ModelMap model) {

        List<Task> taskList1 = taskService.viewassignedTasks(LoginController.loggedEmployee);
        model.put("tasksList1", taskList1);
        return "view_assigned_tasks";

    }

    @ModelAttribute("employeesList")
    public List<Employee> getEmployees() {
        List employeesList = employeeService.getEmployees();

        return employeesList;
    }

}
