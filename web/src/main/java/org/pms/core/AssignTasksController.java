package org.pms.core;

import org.pms.core.service.AssignTasksService;
import org.pms.core.service.GetEmployeesService;
import org.pms.core.service.GetTasksService;
import org.pms.orm.beans.AssignBean;
import org.pms.orm.beans.EmployeeNumberBean;
import org.pms.orm.beans.GetTasksBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jaliya on 7/21/17.
 */

@Controller
public class AssignTasksController {


    @Autowired
    private AssignTasksService assigntasksService;

    @Autowired
    private GetTasksService gettasksService;

    @Autowired
    private GetEmployeesService getemployeesService;


    @RequestMapping(value = "/assign_tasks", method = RequestMethod.GET)
    public String projects(Model model4) {
        model4.addAttribute("assignBean", new AssignBean());
        return "assign_tasks";
    }

    @RequestMapping(value = "/assigntask", method = RequestMethod.POST)
    public String assignTask(@ModelAttribute("assignBean") AssignBean assignBean,ModelMap model) {

        assigntasksService.assignTask(assignBean);
        model.put("sucessMsg", "Task Sucessfully assigned");
        return "/assign_tasks";
    }

    @ModelAttribute("tasksList")
    public List<GetTasksBean> getTasks()
    {
        List tasksList = gettasksService.getTasks();

        return tasksList;
    }


    @ModelAttribute("employeesList")
    public List<EmployeeNumberBean> getEmployees()
    {
        List employeesList = getemployeesService.getEmployees();

        return employeesList;
    }

}