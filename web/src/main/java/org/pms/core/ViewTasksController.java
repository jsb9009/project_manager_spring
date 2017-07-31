package org.pms.core;

import org.pms.core.service.ViewTasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */
@Controller
public class ViewTasksController {


    @Autowired
    private ViewTasksService viewtasksService;


    @RequestMapping(value = "/view_tasks")
    public String viewTasks(ModelMap model)
    {

        List tasksList = viewtasksService.viewTasks();
        model.put("tasksList", tasksList);
        return "view_tasks";
    }
}
