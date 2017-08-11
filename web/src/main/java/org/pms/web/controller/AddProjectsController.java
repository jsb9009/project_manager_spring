package org.pms.web.controller;

import org.pms.core.service.ProjectService;
import org.pms.orm.model.Project;
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
    private ProjectService projectService;

    @RequestMapping("/add_projects")
    public String projects(Model model3) {
        model3.addAttribute("project", new Project());
        return "add_projects";
    }

    @RequestMapping(value = "/addproject", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute("project") Project project, ModelMap model) {

        projectService.addProjects(project);
        model.put("sucessMsg", "Project Sucessfully added");
        return "/add_projects";
    }


}
