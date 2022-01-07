package org.wecancodeit.com.project.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.com.project.repositories.*;

import javax.annotation.Resource;

@Controller
public class PackageController {

    @Resource
    protected PackageRepository packageRepo;

    @RequestMapping("/packages")
    public String findAllPackages(Model model) {
        model.addAttribute("packages", packageRepo.findAll());
        return "packageView";
    }

    @RequestMapping("/packages")
    public String findOnePackage(@RequestParam(value = "id") Long id, Model model) {
        model.addAttribute("package", packageRepo.findById(id).get());
        return "packageView";
    }

}




