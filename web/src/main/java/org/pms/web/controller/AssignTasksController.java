package org.pms.web.controller;

import org.pms.core.service.EmployeeService;
import org.pms.core.service.TaskService;
import org.pms.core.util.LoggedUser;
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
 * Created by jaliya on 7/21/17.
 */

@Controller
public class AssignTasksController {


    @Autowired
    private TaskService taskService;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/assign_tasks", method = RequestMethod.GET)
    public String projects(Model model4,ModelMap model) {
        model4.addAttribute("task", new Task());
        List tasksList = taskService.getTasks();
        model.put("tasksList", tasksList);
        return "assign_tasks";
    }

    @RequestMapping(value = "/assigntask", method = RequestMethod.POST)
    public String assignTask(@ModelAttribute("task") Task task, ModelMap model) {

        taskService.assignTask(task);
        return "redirect:/assign_tasks";
    }

    @ModelAttribute("tasksList")
    public List<Task> getTasks() {
        List tasksList = taskService.getTasks();

        return tasksList;
    }


    @ModelAttribute("employeesList")
    public List<Task> getEmployees() {
        List employeesList = employeeService.getEmployees();

        return employeesList;
    }

    @RequestMapping("/go_to_supervisor_direct1")
    public ModelAndView redirect(Model model) {
        model.addAttribute("user", LoggedUser.loggedEmployee.getEmpName());
        return new ModelAndView("supervisor_direct");
    }

}