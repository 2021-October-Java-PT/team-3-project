package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.models.Island;
import org.wecancodeit.com.project.repositories.IslandRepository;

import javax.annotation.Resource;

@Controller
public class IslandController {

    @Resource
    private IslandRepository islandRepo;

    @RequestMapping("/islands")
    public String displayIslands(Model model) {
        model.addAttribute("islands", islandRepo.findAll());
        return "islandsView";
    }

    @GetMapping("/islands/{name}")
    public String displaySingleIsland(@PathVariable String name, Model model){
        Island retrieveIsland = islandRepo.findIslandByName(name);
        model.addAttribute("island", retrieveIsland);
        return "islandView";
    }
}
