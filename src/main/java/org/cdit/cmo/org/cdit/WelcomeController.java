package org.cdit.cmo.org.cdit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 05/04/18.
 */

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.template";
    }
}
