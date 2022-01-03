package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class AboutUsController {


    @RequestMapping({"/aboutUs"})
    public String displayAboutUs () {
        return"aboutUsView";
    }

}
