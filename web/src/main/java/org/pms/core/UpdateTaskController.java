package org.pms.core;

import org.pms.core.service.GetTasksService;
import org.pms.core.service.UpdateTaskService;
import org.pms.orm.model.Tasks;
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
 * Created by jaliya on 7/24/17.
 */

@Controller
public class UpdateTaskController {

    @Autowired
    private UpdateTaskService updatetaskService;

    @Autowired
    private GetTasksService gettasksService;

    @RequestMapping(value = "/update_tasks", method = RequestMethod.GET)
    public String projects(Model model6) {
        model6.addAttribute("tasks", new Tasks());
        return "update_tasks";
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
    public List<Tasks> getTasks() {
        List tasksList = gettasksService.getTasks();

        return tasksList;
    }


    @RequestMapping(value = "/updatetask", method = RequestMethod.POST)
    public String updateTask(@ModelAttribute("tasks") Tasks tasks, ModelMap model) {

        updatetaskService.updateTask(tasks);
        model.put("sucessMsg", "Task Sucessfully updated");
        return "/update_tasks";
    }
}
