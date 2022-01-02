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
public class CountryController {


    @Resource
    protected CountryRepository countryRepo;
    @Resource
    protected IslandClusterRepository islandClusterRepo;



    @RequestMapping("/countries")
    public String displayCountries(Model model){
        model.addAttribute("countries", countryRepo.findAll());
        return "countriesView";
    }

    @RequestMapping("/country")
    public String findOneCountry(@RequestParam(value="id")Long id, Model model){
        model.addAttribute("country", countryRepo.findById(id).get());
        return "countryView";
    }

}
