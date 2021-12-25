package org.wecancodeit.com.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.models.Country;

import javax.annotation.Resource;

@Controller
public class CountryController {

    @Resource
    private CountryRepository countryRepo;

    @RequestMapping({"/countries", "/", ""})
    public String displayCountry(Model model){
        model.addAttribute("countries", countryRepo.findAll());
        return "countriesView";
    }

    @GetMapping("/country/{name}")
    public String displaySingleCampus(@PathVariable String name, Model model){
        Country retrievedCountry = countryRepo.findCountryByName(name);
        model.addAttribute("country", retrievedCountry);
        return"countryView";
    }

}
