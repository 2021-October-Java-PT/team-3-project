package org.wecancodeit.com.project.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.models.Ocean;
import org.wecancodeit.com.project.repositories.OceanRepository;

import java.util.Optional;

@Controller
public class OceanController {
    private OceanRepository oceanRepo;

    @RequestMapping("/ocean/{id}")
    public String listOcean(@PathVariable Long id, Model model){
        Ocean retrievedOcean = oceanRepo.findOcean(id);
        model.addAttribute("ocean", retrievedOcean);
        return "oceanView";
    }
}
