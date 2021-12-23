package org.wecancodeit.com.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class AboutUsController {


    @RequestMapping({"/aboutus"})
    public String displayAboutUs () {
        return"aboutUs";
    }

}
