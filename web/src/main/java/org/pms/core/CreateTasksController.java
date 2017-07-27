package org.pms.core;

import org.pms.core.service.CreateTasksService;
import org.pms.orm.beans.TaskBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jaliya on 7/21/17.
 */

@Controller
public class CreateTasksController {

    @Autowired
    private CreateTasksService createtasksService;

    @RequestMapping("/create_tasks")
    public String projects(Model model3) {
        model3.addAttribute("taskBean", new TaskBean());
        return "create_tasks";
    }

    @RequestMapping(value = "/createtask", method = RequestMethod.POST)
    public String createTask(@ModelAttribute("taskBean") TaskBean taskBean,ModelMap model) {

        createtasksService.createTasks(taskBean);
        model.put("sucessMsg", "Task Sucessfully created");
        return "/create_tasks";
    }

}
