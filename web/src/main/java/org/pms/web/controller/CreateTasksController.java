package org.pms.web.controller;

import org.pms.core.service.ProjectService;
import org.pms.core.service.TaskService;
import org.pms.orm.model.Project;
import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaliya on 7/21/17.
 */

@Controller
public class CreateTasksController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/create_tasks")
    public String projects(Model model3) {
        model3.addAttribute("task", new Task());
        return "create_tasks";
    }

    @RequestMapping(value = "/createtask", method = RequestMethod.POST)
    public String createTask(@ModelAttribute("task") Task task, ModelMap model) {


        taskService.createTasks(task);
        model.put("sucessMsg", "Task Sucessfully created");
        return "/create_tasks";
    }

    @ModelAttribute("statusList")
    public List<String> getNumbersList() {
        List<String> statusList = new ArrayList<String>();
        statusList.add("Beginning");
        statusList.add("On going");
        statusList.add("Complete");
        return statusList;
    }

    @ModelAttribute("projectsList")
    public List<Project> getProjects() {
        List projectsList = projectService.getProjects();

        return projectsList;
    }
}
