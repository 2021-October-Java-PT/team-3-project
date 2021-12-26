package org.wecancodeit.com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.com.project.models.*;
import org.wecancodeit.com.project.repositories.*;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    private ContinentRepository continentRepo;
    private CountryRepository countryRepo;
    private IslandRepository islandRepo;
    private IslandClusterRepository islandClusterRepo;
    private OceanRepository oceanRepo;

    @Override
    public void run(String... args) throws Exception {
        Continent africa = new Continent("Africa");
        continentRepo.save(africa);
        Country lambu = new Country("lambu",africa);
        countryRepo.save(lambu);
        IslandCluster cluster = new IslandCluster("name", lambu, africa);
        islandClusterRepo.save(cluster);
        Island jay = new Island("jay", "description", lambu, africa, cluster);
        islandRepo.save(jay);
        Ocean indian = new Ocean("Indian Ocean");
        oceanRepo.save(indian);


    }

}