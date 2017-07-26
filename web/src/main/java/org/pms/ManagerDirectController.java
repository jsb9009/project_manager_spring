package org.pms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jaliya on 7/20/17.
 */

@Controller
public class ManagerDirectController {

    @RequestMapping("/manager_direct")
    public String manager(Model model1) {

        return "manager_direct";
    }

}
