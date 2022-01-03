package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.repositories.*;

import javax.annotation.Resource;


@Controller
public class homeController {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private CountryRepository countryRepo;
    @Resource
    private IslandClusterRepository islandClusterRepo;
    @Resource
    private IslandRepository islandRepo;
    @Resource
    private OceanRepository oceanRepo;



    @RequestMapping({"/home","/", ""})
        public String homeData(Model model){
            model.addAttribute("continentsModel", continentRepo.findAll());
            model.addAttribute("countries", countryRepo.findAll());
            model.addAttribute("islandClustersList", islandClusterRepo.findAll());
            model.addAttribute("islands", islandRepo.findAll());
            model.addAttribute("oceans", oceanRepo.findAll());
            return "home";
        }
}


