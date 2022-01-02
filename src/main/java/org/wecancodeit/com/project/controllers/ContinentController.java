package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.com.project.repositories.ContinentRepository;
import org.wecancodeit.com.project.repositories.CountryRepository;
import org.wecancodeit.com.project.repositories.IslandClusterRepository;
import org.wecancodeit.com.project.repositories.IslandRepository;

import javax.annotation.Resource;


@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private CountryRepository countryRepo;
    @Resource
    private IslandClusterRepository islandClusterRepo;
    @Resource
    private IslandRepository islandRepo;


    @RequestMapping("/continents")
    public String findAllContinents(Model model){
        model.addAttribute("continentsModel", continentRepo.findAll());
        return "continentsView";
    }

    @RequestMapping("/continent")
    public String findOneContinent(@RequestParam(value="id")Long id, Model model){
        model.addAttribute("continentModel", continentRepo.findById(id).get());
        return "continentView";
    }
}
