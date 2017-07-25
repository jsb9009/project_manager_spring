package org.pms;

import org.pms.orm.beans.AssignBean;
import org.pms.orm.beans.ChooseEmployeeBean;
import org.pms.orm.beans.ProjectBean;
import org.pms.orm.daoImpl.AssignDaoImpl;
import org.pms.orm.daoImpl.ChooseEmployeeDaoImpl;
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
public class ChooseEmployee {

    @Autowired
    private ChooseEmployeeDaoImpl chooseemployeedaoImpl;

    @RequestMapping("/view_assigned_tasks")
    public String projects(Model model7) {
        model7.addAttribute("chooseemployeeBean", new ChooseEmployeeBean());
        return "employee_choose";
    }

    @RequestMapping(value = "/choseemployee")
    public String viewassignedTasks(ModelMap model) {

        ChooseEmployeeBean chooseemployeeBean = new ChooseEmployeeBean();

//        model.addAttribute("chooseemployeeBean", new ChooseEmployeeBean());
        List tasksList1 = chooseemployeedaoImpl.viewassignedTasks(chooseemployeeBean);
        System.out.println(tasksList1);
        model.put("tasksList1", tasksList1);

        return "view_assigned_tasks";
    }

}
