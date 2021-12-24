package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.models.Continent;
import org.wecancodeit.com.project.repositories.ContinentRepository;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class ContinentController {
    private ContinentRepository continentRepo;


    public ContinentController(ContinentRepository continentRepo){
        this.continentRepo=continentRepo;
    }

    @RequestMapping("/continent/{id}")
    public String listSingleContinent(@PathVariable Long id, Model model){

        Optional<Continent> foundContinent = continentRepo.findById(id);
        model.addAttribute("singleContinent", foundContinent.get());

        return "continentList.html";
    }
}