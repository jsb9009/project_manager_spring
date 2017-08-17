package org.pms.web.controller;

import org.pms.core.service.ProjectService;
import org.pms.core.service.TaskService;
import org.pms.core.util.LoggedUser;
import org.pms.orm.model.Project;
import org.pms.orm.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
    public String projects(Model model3, ModelMap model) {

        model3.addAttribute("task", new Task());
        List tasksList = taskService.viewTasks();
        model.put("tasksList", tasksList);
        return "create_tasks";
    }

    @RequestMapping(value = "/createtask", method = RequestMethod.POST)
    public String createTask(@ModelAttribute("task") Task task, ModelMap model) {

        taskService.createTasks(task);
        model.put("sucessMsg", "Task Sucessfully created");
        return "redirect:/create_tasks";
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

    @RequestMapping("deleteTask")
    public ModelAndView deleteEmployee(@RequestParam long id) {
        taskService.deleteTask(id);
        return new ModelAndView("redirect:/create_tasks");
    }

    @RequestMapping("/go_to_supervisor_direct")
    public ModelAndView redirect(Model model) {
        model.addAttribute("user", LoggedUser.loggedEmployee.getEmpName());
        return new ModelAndView("supervisor_direct");
    }

}

//TODO using datatables for displaying objects
//    @RequestMapping(value = "/generate", method = RequestMethod.POST)
//    public @ResponseBody List<Task> generate() {
//
//        List tasksList = taskService.viewTasks();
//
//
//        return tasksList;
//
//
//    }



