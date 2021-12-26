package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.com.project.models.Continent;
import org.wecancodeit.com.project.repositories.ContinentRepository;


@Controller
public class ContinentController {
    private ContinentRepository continentRepo;


    public ContinentController(ContinentRepository continentRepo){
        this.continentRepo=continentRepo;
    }

    @RequestMapping("/continents")
    public String findAllContinents(Model model){
        model.addAttribute("continentsList", continentRepo.findAll());
        return "continentsTemplate";
    }

    @RequestMapping("/continent")
    public String findOneContinent(@RequestParam(value="id")Long id, Model model){
        model.addAttribute("continent", continentRepo.findOne(id));
        return "continentTemplate";
    }
}
