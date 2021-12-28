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

    @GetMapping("/island/{id}")
    public String displaySingleIsland(@PathVariable Long id, Model model){
        Island retrieveIsland = islandRepo.findOne(id);
        model.addAttribute("island", retrieveIsland);
        return "islandView";
    }
}
