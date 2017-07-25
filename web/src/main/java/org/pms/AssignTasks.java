package org.pms;

import org.pms.orm.beans.AssignBean;
import org.pms.orm.beans.TaskBean;
import org.pms.orm.daoImpl.AssignDaoImpl;
import org.pms.orm.daoImpl.TaskDaoImpl;
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
public class AssignTasks {

    @Autowired
    private AssignDaoImpl assignDaoImpl;

    @RequestMapping(value="/assign_tasks",method= RequestMethod.GET)
    public String projects(Model model4) {
        model4.addAttribute("assignBean", new AssignBean());
        return "assign_tasks";
    }

    @RequestMapping(value = "/assigntask",method= RequestMethod.POST)
    public ModelAndView assignTask(@ModelAttribute("assignBean") AssignBean assignBean){

        assignDaoImpl.assignTask(assignBean);
        return new ModelAndView("redirect:/assign_tasks");
    }

}