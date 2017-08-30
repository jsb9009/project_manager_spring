package org.pms.web.controller;

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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */

@Controller
public class UpdateTaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/update_tasks", method = RequestMethod.GET)
    public String projects(Model model6, ModelMap model) {
        model6.addAttribute("task", new Task());
        List<Task> taskList1 = taskService.viewassignedTasks(LoggedUser.loggedEmployee);
        model.put("tasksList1", taskList1);

        if (LoggedUser.loggedEmployee.getAuthinticationLevel() != null) {
            if (LoggedUser.loggedEmployee.getAuthinticationLevel().equals("Employee")) {
                return "update_tasks";
            } else {
                return "please_login";
            }
        } else {
            return "please_login";
        }
    }

    @ModelAttribute("statusList")
    public List<String> getStatusList() {
        List<String> statusList = new ArrayList<String>();
        statusList.add("Beginning");
        statusList.add("On going");
        statusList.add("Complete");
        return statusList;
    }


    @ModelAttribute("tasksList")
    public List<Task> getTasks() {
        List tasksList = taskService.getTasks();

        return tasksList;
    }

    @RequestMapping(value = "/updatetask", method = RequestMethod.POST)
    public String updateTask(@ModelAttribute("task") Task task, ModelMap model) {

        taskService.updateTask(task);
        return "redirect:/update_tasks";
    }

    @RequestMapping("/go_to_employee_direct")
    public ModelAndView redirect(Model model) {
        model.addAttribute("user", LoggedUser.loggedEmployee.getEmpName());
        return new ModelAndView("employee_direct");
    }
}
