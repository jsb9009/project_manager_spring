package org.pms.web.controller;

import org.pms.core.service.GetEmployeesService;
import org.pms.core.service.ViewAssignedTasksService;
import org.pms.orm.model.Employee;
import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */

@Controller
public class ViewAssignedTasksController {


    @Autowired
    private ViewAssignedTasksService viewassignedtasksService;

    @Autowired
    private GetEmployeesService getemployeesService;

    @RequestMapping("/view_assigned_tasks_list")
    public String projects(Model model7) {
        model7.addAttribute("task", new Task());
        return "employee_choose";
    }

    @RequestMapping(value = "/select_employee", method = RequestMethod.POST)
    public ModelAndView chooseEmpoyeeNo(@ModelAttribute("task") Task task) {

        return new ModelAndView("view_assigned_tasks");

    }

    @RequestMapping(value = "/view_assigned_tasks", method = RequestMethod.POST)
    public String viewassignedTasks(ModelMap model,Task task) {

        List<Task> taskList1 = viewassignedtasksService.viewassignedTasks(task);
        model.put("tasksList1", taskList1);
        return "view_assigned_tasks";

    }

    @ModelAttribute("employeesList")
    public List<Employee> getEmployees(){
        List employeesList = getemployeesService.getEmployees();

        return employeesList;
    }

}
