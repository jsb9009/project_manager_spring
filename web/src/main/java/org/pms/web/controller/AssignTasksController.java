package org.pms.web.controller;

import org.pms.core.service.EmployeeService;
import org.pms.core.service.TaskService;
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
 * Created by jaliya on 7/21/17.
 */

@Controller
public class AssignTasksController {


    @Autowired
    private TaskService taskService;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/assign_tasks", method = RequestMethod.GET)
    public String projects(Model model4) {
        model4.addAttribute("task", new Task());
        return "assign_tasks";
    }

    @RequestMapping(value = "/assigntask", method = RequestMethod.POST)
    public String assignTask(@ModelAttribute("task") Task task, ModelMap model) {

        taskService.assignTask(task);
        model.put("sucessMsg", "Task Sucessfully assigned");
        return "/assign_tasks";
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

}