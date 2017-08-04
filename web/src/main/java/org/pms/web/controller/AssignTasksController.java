package org.pms.web.controller;

import org.pms.core.service.AssignTasksService;
import org.pms.core.service.GetEmployeesService;
import org.pms.core.service.GetTasksService;
import org.pms.orm.model.Tasks;
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
    private AssignTasksService assigntasksService;

    @Autowired
    private GetTasksService gettasksService;

    @Autowired
    private GetEmployeesService getemployeesService;


    @RequestMapping(value = "/assign_tasks", method = RequestMethod.GET)
    public String projects(Model model4) {
        model4.addAttribute("tasks", new Tasks());
        return "assign_tasks";
    }

    @RequestMapping(value = "/assigntask", method = RequestMethod.POST)
    public String assignTask(@ModelAttribute("tasks") Tasks tasks, ModelMap model) {

        assigntasksService.assignTask(tasks);
        model.put("sucessMsg", "Task Sucessfully assigned");
        return "/assign_tasks";
    }

    @ModelAttribute("tasksList")
    public List<Tasks> getTasks() {
        List tasksList = gettasksService.getTasks();

        return tasksList;
    }


    @ModelAttribute("employeesList")
    public List<Tasks> getEmployees() {
        List employeesList = getemployeesService.getEmployees();

        return employeesList;
    }

}