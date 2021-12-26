package org.wecancodeit.com.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.models.Location;

import javax.annotation.Resource;
import javax.persistence.GeneratedValue;

@Controller
public class LocationController {

    @Resource
    private LocationRepository locationRepo;

    @RequestMapping({"/locations"})
    public String displayLocation(Model model){
        model.addAttribute("locations", locationRepo.findAll());
        return "locationView";
    }

    @GeneratedValue
    public String displaySingleLocation(@PathVariable String name, Model model){
        Location retrievedLocation = locationRepo. findLocationByName(name);
        model.addAttribute("location", retrievedLocation);
        return "locationView";
    }
}