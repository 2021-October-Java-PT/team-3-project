package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.com.project.repositories.IslandClusterRepository;
import org.wecancodeit.com.project.repositories.IslandRepository;

import javax.annotation.Resource;

@Controller
public class IslandClusterController {

    @Resource
    protected IslandClusterRepository islandClusterRepo;
    @Resource
    protected IslandRepository islandRepo;


    @RequestMapping("/islandClusters")
    public String findAllClusters(Model model){
        model.addAttribute("islandClusters", islandClusterRepo.findAll());
        return "islandClustersView";
    }

    @RequestMapping("/islandCluster")
    public String findOneIslandCluster(@RequestParam(value="id")Long id, Model model){
        model.addAttribute("islandCluster", islandClusterRepo.findById(id).get());
        return "islandClusterView";
    }
}