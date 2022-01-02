package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.com.project.models.Island;
import org.wecancodeit.com.project.repositories.ContinentRepository;
import org.wecancodeit.com.project.repositories.CountryRepository;
import org.wecancodeit.com.project.repositories.IslandClusterRepository;
import org.wecancodeit.com.project.repositories.IslandRepository;

import javax.annotation.Resource;

@Controller
public class IslandController {

    @Resource
    protected ContinentRepository continentRepo;
    @Resource
    protected CountryRepository countryRepo;
    @Resource
    protected IslandClusterRepository islandClusterRepo;
    @Resource
    protected IslandRepository islandRepo;

    @RequestMapping("/islands")
    public String displayIslands(Model model) {
        model.addAttribute("islands", islandRepo.findAll());
        return "islandsView";
    }

    @RequestMapping("/island")
    public String findOneIsland(@RequestParam Long id, Model model){
        model.addAttribute("island", islandRepo.findById(id).get());
        return "islandView";
    }
}
