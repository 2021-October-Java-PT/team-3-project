package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.com.project.repositories.ContinentRepository;
import org.wecancodeit.com.project.repositories.CountryRepository;
import org.wecancodeit.com.project.repositories.IslandClusterRepository;
import org.wecancodeit.com.project.repositories.IslandRepository;

import javax.annotation.Resource;

@Controller
public class IslandClusterController {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private CountryRepository countryRepo;
    @Resource
    private IslandClusterRepository islandClusterRepo;
    @Resource
    private IslandRepository islandRepo;


    @RequestMapping("/islandClusters")
    public String findAllClusters(Model model){
        model.addAttribute("islandClustersList", islandClusterRepo.findAll());
        return "islandClustersView";
    }

    @RequestMapping("/islandCluster/{id}")
    public String listIslandCluster(@RequestParam(value="id")Long id, Model model){
        model.addAttribute("islandCluster", islandClusterRepo.findById(id).get());
        model.addAttribute("continentsModel", continentRepo.findAll());
        model.addAttribute("countries", countryRepo.findAll());
        model.addAttribute("islands", islandRepo.findAll());
        return "islandClusterView";
    }
}