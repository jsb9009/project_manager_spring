package org.pms;

import org.pms.orm.beans.ChooseEmployeeBean;
import org.pms.orm.beans.EmployeeNumberBean;
import org.pms.orm.dao.impl.ChooseEmployeeDaoImpl;
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
public class SelectEmployeeController {

    @Autowired
    private ChooseEmployeeDaoImpl chooseemployeedaoImpl;

    @RequestMapping("/view_assigned_tasks_list")
    public String projects(Model model7) {
        model7.addAttribute("employeenumberBean", new EmployeeNumberBean());
        return "employee_choose";
    }

    @RequestMapping(value = "/select_employee", method = RequestMethod.POST)
    public ModelAndView chooseEmpoyeeNo(@ModelAttribute("employeenumberBean") EmployeeNumberBean employeenumberBean, String indexNo) {

        chooseemployeedaoImpl.chooseEmpoyeeNo(indexNo);
        return new ModelAndView("view_assigned_tasks");

    }

    @RequestMapping(value = "/view_assigned_tasks", method = RequestMethod.POST)
    public String viewassignedTasks(ModelMap model, EmployeeNumberBean employeenumberBean, ChooseEmployeeBean chooseemployeeBean) {

        List<ChooseEmployeeBean> tasksList1 = chooseemployeedaoImpl.viewassignedTasks(employeenumberBean.getEmp_no());
        System.out.println(tasksList1);
        model.put("tasksList1", tasksList1);
        return "view_assigned_tasks";

    }


}
