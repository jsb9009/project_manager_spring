package org.pms.core;

import org.pms.core.service.AssignTasksService;
import org.pms.orm.beans.AssignBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jaliya on 7/21/17.
 */

@Controller
public class AssignTasksController {


    @Autowired
    private AssignTasksService assigntasksService;

    @RequestMapping(value = "/assign_tasks", method = RequestMethod.GET)
    public String projects(Model model4) {
        model4.addAttribute("assignBean", new AssignBean());
        return "assign_tasks";
    }

    @RequestMapping(value = "/assigntask", method = RequestMethod.POST)
    public ModelAndView assignTask(@ModelAttribute("assignBean") AssignBean assignBean) {

        assigntasksService.assignTask(assignBean);
        return new ModelAndView("redirect:/assign_tasks");
    }

}