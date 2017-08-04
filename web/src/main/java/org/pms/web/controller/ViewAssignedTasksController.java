package org.pms.web.controller;

import org.pms.core.service.GetEmployeesService;
import org.pms.core.service.ViewAssignedTasksService;
import org.pms.orm.model.Employees;
import org.pms.orm.model.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */

@Controller
public class ViewAssignedTasksController {


    @Autowired
    private ViewAssignedTasksService viewassignedtasksService;

    @Autowired
    private GetEmployeesService getemployeesService;

    @RequestMapping("/view_assigned_tasks_list")
    public String projects(Model model7) {
        model7.addAttribute("tasks", new Tasks());
        return "employee_choose";
    }

    @RequestMapping(value = "/select_employee", method = RequestMethod.POST)
    public ModelAndView chooseEmpoyeeNo(@ModelAttribute("tasks") Tasks tasks) {

//       viewassignedtasksService.chooseEmployeeNo(tasks);
        return new ModelAndView("view_assigned_tasks");

    }

    @RequestMapping(value = "/view_assigned_tasks", method = RequestMethod.POST)
    public String viewassignedTasks(ModelMap model,Tasks tasks) {

        List<Tasks> tasksList1 = viewassignedtasksService.viewassignedTasks(tasks);
        model.put("tasksList1", tasksList1);
        return "view_assigned_tasks";

    }

    @ModelAttribute("employeesList")
    public List<Employees> getEmployees(){
        List employeesList = getemployeesService.getEmployees();

        return employeesList;
    }

}
