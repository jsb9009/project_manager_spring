package org.pms.web.controller;

import org.pms.core.service.ProjectService;
import org.pms.core.util.LoggedUser;
import org.pms.orm.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by jaliya on 7/20/17.
 */

@Controller
public class AddProjectsController {


    @Autowired
    private ProjectService projectService;

    @RequestMapping("/add_projects")
    public String projects(Model model3, ModelMap model) {
        model3.addAttribute("project", new Project());
        List projectList = projectService.getProjects();
        model.put("projectList", projectList);
        return "add_projects";
    }

    @RequestMapping(value = "/addproject", method = RequestMethod.POST)
    public ModelAndView saveProject(@ModelAttribute("project") Project project, ModelMap model) {

        projectService.addProjects(project);
        model.put("sucessMsg", "Project Sucessfully added");
        model.addAttribute("project", new Project());
        List projectList = projectService.getProjects();
        model.put("projectList", projectList);
        return new ModelAndView("add_projects");
    }

    @RequestMapping("deleteProject")
    public ModelAndView deleteEmployee(@RequestParam long id) {
        projectService.deleteProject(id);
        return new ModelAndView("redirect:/add_projects");
    }

    @RequestMapping("/go_to_manager_direct1")
    public ModelAndView redirect(Model model) {
        model.addAttribute("user", LoggedUser.loggedEmployee.getEmpName());
        return new ModelAndView("manager_direct");
    }
}
