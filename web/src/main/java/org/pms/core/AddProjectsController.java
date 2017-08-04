package org.pms.core;

import org.pms.core.service.AddProjectsService;
import org.pms.orm.model.Projects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jaliya on 7/20/17.
 */

@Controller
public class AddProjectsController {


    @Autowired
    private AddProjectsService addprojectsService;

    @RequestMapping("/add_projects")
    public String projects(Model model3) {
        model3.addAttribute("projects", new Projects());
        return "add_projects";
    }

    @RequestMapping(value = "/addproject", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute("projects") Projects projects, ModelMap model) {

        addprojectsService.addProjects(projects);
        model.put("sucessMsg", "Project Sucessfully added");
        return "/add_projects";
    }


}
