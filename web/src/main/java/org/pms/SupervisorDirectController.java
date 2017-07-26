package org.pms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jaliya on 7/21/17.
 */

@Controller
public class SupervisorDirectController {

    @RequestMapping("/supervisor_direct")
    public String manager(Model model1) {

        return "supervisor_direct";
    }

}
