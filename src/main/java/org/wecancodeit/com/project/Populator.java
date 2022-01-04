package org.wecancodeit.com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.com.project.models.*;
import org.wecancodeit.com.project.repositories.*;

import javax.annotation.Resource;
import java.util.Collection;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private CountryRepository countryRepo;
    @Resource
    private IslandClusterRepository islandClusterRepo;
    @Resource
    private IslandRepository islandRepo;
    @Resource
    private OceanRepository oceanRepo;

    @Override
    public void run(String... args) throws Exception {
        Continent africa = new Continent("Africa", "describe", "/images/island.png");
        continentRepo.save(africa);

        Continent europe = new Continent("Europe", "describe","image here");
        continentRepo.save(europe);
        Continent northAmerica = new Continent("North America", "describe", "image here");
        continentRepo.save(northAmerica);
        Continent southAmerica = new Continent("South America", "describe","image");
        continentRepo.save(southAmerica);
        Continent asia = new Continent("Asia", "describe", "image");
        continentRepo.save(asia);
        Continent oceania = new Continent("Oceania", "describe", "image");
        continentRepo.save(oceania);
        Ocean indian = new Ocean("Indian Ocean");
        oceanRepo.save(indian);
        Ocean atlantic = new Ocean("Atlantic Ocean");
        oceanRepo.save(atlantic);
        Ocean pacific = new Ocean("Pacific Ocean");
        oceanRepo.save(pacific);
        Ocean artic = new Ocean("Artic Ocean");
        oceanRepo.save(artic);
        Country lambu = new Country("lambu",africa,"describe","/images/island.png");
        countryRepo.save(lambu);
        IslandCluster cluster = new IslandCluster("name", "describe", lambu, africa, "/images/island.png",indian, pacific);
        islandClusterRepo.save(cluster);
        IslandCluster cluster2 = new IslandCluster("name2", "describe",lambu, africa, "/images/island.png",atlantic);
        islandClusterRepo.save(cluster2);
         Island jay = new Island("jay", "description", lambu, africa, cluster, "/images/island.png");
        islandRepo.save(jay);





    }

}