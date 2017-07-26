package org.pms;

import org.pms.orm.beans.LoginBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * Created by jaliya on 7/20/17.
 */

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Model m) {
        m.addAttribute("loginBean", new LoginBean());
        return "login";
    }

    @RequestMapping("/loginin")
    public String loginin(Model model, @ModelAttribute("loginBean") LoginBean loginBean) throws IOException {

        if (loginBean != null && loginBean.getUsername() != null & loginBean.getPassword() != null) {
            if (loginBean.getUsername().equals("manager") && loginBean.getPassword().equals("manager")) {

                model.addAttribute("msg", "welcome manager");
                return "manager_direct";

            } else if ((loginBean.getUsername().equals("supervisor") && loginBean.getPassword().equals("supervisor"))) {
                model.addAttribute("msg1", "welcome supervisor");
                return "supervisor_direct";

            } else if ((loginBean.getUsername().equals("employee") && loginBean.getPassword().equals("employee"))) {
                model.addAttribute("msg2", "welcome employee");
                return "employee_direct";

            } else {
                model.addAttribute("error", "Invalid Details");
                return "login";
            }
        } else {
            model.addAttribute("error", "Please enter Details");
            return "login";
        }
    }

   /* @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {
        return "manager_direct";
    } */
}


