package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.models.Continent;
import org.wecancodeit.com.project.models.IslandCluster;
import org.wecancodeit.com.project.repositories.ContinentRepository;
import org.wecancodeit.com.project.repositories.IslandClusterRepository;

import java.util.Optional;

@Controller
public class IslandClusterController {
    private IslandClusterRepository islandClusterRepo;


    public IslandClusterController(IslandClusterRepository islandClusterRepo){
        this.islandClusterRepo=islandClusterRepo;
    }

    @RequestMapping("/islandCluster/{id}")
    public String listIslandCluster(@PathVariable Long id, Model model){

        Optional<IslandCluster> foundIslandCluster = islandClusterRepo.findById(id);
        model.addAttribute("islandCluster", foundIslandCluster.get());

        return "islandClusterList.html";
    }
}