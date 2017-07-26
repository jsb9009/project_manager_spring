package org.pms;

/**
 * Created by jaliya on 7/18/17.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

/**
 * Created by  on 2/10/17.
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model m) {

        return "index";
    }

}
