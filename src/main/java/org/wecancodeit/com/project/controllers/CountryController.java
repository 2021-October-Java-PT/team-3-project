package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.models.Country;
import org.wecancodeit.com.project.repositories.CountryRepository;

import javax.annotation.Resource;

@Controller
public class CountryController {

    @Resource
    private CountryRepository countryRepo;

    @RequestMapping({"/countries", "/", ""})
    public String displayCountries(Model model){
        model.addAttribute("countries", countryRepo.findAll());
        return "countriesView";
    }

    @GetMapping("/country/{name}")
    public String displaySingleCountry(@PathVariable Long id, Model model){
        Country retrievedCountry = countryRepo.findOne(id);
        model.addAttribute("country", retrievedCountry);
        return"countryView";
    }

}
