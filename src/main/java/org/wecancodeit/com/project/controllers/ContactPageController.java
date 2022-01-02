package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactPageController {
    @RequestMapping({"/contactPage"})
    public String displayContactPage (@PathVariable String contactPageView, Model model) {
        return"contactPageView";
    }


}

