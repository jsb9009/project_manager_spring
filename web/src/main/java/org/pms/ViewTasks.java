package org.pms;

import org.pms.orm.ViewTasksDao;
import org.pms.orm.beans.EmployeeBean;
import org.pms.orm.beans.ViewTasksBean;
import org.pms.orm.daoImpl.EmployeeDaoImpl;
import org.pms.orm.daoImpl.ViewTasksDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */
@Controller
public class ViewTasks {

    @Autowired
    private ViewTasksDaoImpl viewtasksDaoImpl;


    @RequestMapping(value = "/view_tasks")
    public String viewTasks(ModelMap model)
    {

        List tasksList = viewtasksDaoImpl.viewTasks();
        System.out.println(tasksList);
        model.put("tasksList", tasksList);

        return "view_tasks";
    }
}
