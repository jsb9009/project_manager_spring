package org.pms.core;

import org.pms.orm.beans.UpdateTaskBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jaliya on 7/24/17.
 */


@Controller
public class UpdateTaskController {

    @Autowired
    private UpdateTaskService updatetaskService;

    @RequestMapping(value="/update_tasks",method= RequestMethod.GET)
    public String projects(Model model6) {
        model6.addAttribute("updatetaskBean", new UpdateTaskBean());
        return "update_tasks";
    }

    @RequestMapping(value = "/updatetask",method= RequestMethod.POST)
    public ModelAndView updateTask(@ModelAttribute("updatetaskBean") UpdateTaskBean updatetaskBean){

        updatetaskService.updateTask(updatetaskBean);
        return new ModelAndView("redirect:/update_tasks");
    }
}
