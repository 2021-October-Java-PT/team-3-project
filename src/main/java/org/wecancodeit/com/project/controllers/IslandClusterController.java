package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.com.project.models.IslandCluster;
import org.wecancodeit.com.project.repositories.IslandClusterRepository;

import java.util.Optional;

@Controller
public class IslandClusterController {
    private IslandClusterRepository islandClusterRepo;


    public IslandClusterController(IslandClusterRepository islandClusterRepo){
        this.islandClusterRepo=islandClusterRepo;
    }

    @RequestMapping("/islandClusters")
    public String findAllClusters(Model model){
        model.addAttribute("islandClustersList", islandClusterRepo.findAll());
        return "islandClustersTemplate";
    }

    @RequestMapping("/islandCluster/{id}")
    public String listIslandCluster(@RequestParam(value="id")Long id, Model model){
        model.addAttribute("islandCluster", islandClusterRepo.findOne(id));
        return "islandClusterList.html";
    }
}