package org.pms.core;

import org.pms.orm.beans.ProjectBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jaliya on 7/20/17.
 */

@Controller
public class AddProjectsController {


    @Autowired
    private AddProjectsService addprojectsService;

    @RequestMapping("/add_projects")
    public String projects(Model model3) {
        model3.addAttribute("projectBean", new ProjectBean());
        return "add_projects";
    }

    @RequestMapping(value = "/addproject", method = RequestMethod.POST)
    public ModelAndView saveProject(@ModelAttribute("projectBean") ProjectBean projectBean) {

        addprojectsService.addProjects(projectBean);
        return new ModelAndView("redirect:/add_projects");
    }


}
