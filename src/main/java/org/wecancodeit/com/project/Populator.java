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
        Continent africa = new Continent("Africa",  "/images/AfricaContinent.png");
        continentRepo.save(africa);
        Continent europe = new Continent("Europe", "/images/EuropeContinent.png");
        continentRepo.save(europe);
        Continent northAmerica = new Continent("North America", "/images/NorthAmericaContinent.png");
        continentRepo.save(northAmerica);
        Continent southAmerica = new Continent("South America","/images/SouthAmericaContinent.png");
        continentRepo.save(southAmerica);
        Continent asia = new Continent("Asia", "/images/AsiaContinent.png");
        continentRepo.save(asia);
        Continent oceania = new Continent("Oceania", "/images/AustraliaContinent.png");
        continentRepo.save(oceania);
        Ocean indian = new Ocean("Indian Ocean");
        oceanRepo.save(indian);
        Ocean atlantic = new Ocean("Atlantic Ocean");
        oceanRepo.save(atlantic);
        Ocean pacific = new Ocean("Pacific Ocean");
        oceanRepo.save(pacific);
        Ocean arctic = new Ocean("Arctic Ocean");
        oceanRepo.save(arctic);
        Country lambu = new Country("lambu",africa,"/images/island.png");
        countryRepo.save(lambu);
        Country southAfrica = new Country("South Africa", africa, "/images/South Africa.png");
        countryRepo.save(southAfrica);
        IslandCluster tristanDaCunah = new IslandCluster("Tristan da Cunah", southAfrica, africa, "images/island.png", atlantic , indian);
        islandClusterRepo.save(tristanDaCunah);
        IslandCluster cluster = new IslandCluster("name", lambu, africa, "/images/island.png",indian, pacific);
        islandClusterRepo.save(cluster);
        IslandCluster cluster2 = new IslandCluster("name2", lambu, africa, "/images/island.png",atlantic);
        islandClusterRepo.save(cluster2);
         Island jay = new Island("jay", lambu, africa, cluster, "/images/island.png");
        islandRepo.save(jay);
        Island edinburgh =new Island("Edinburgh of the Seven Seas", southAfrica,africa,tristanDaCunah,"/images/island.png");
        islandRepo.save(edinburgh);
        Country unitedStates = new Country("United States", northAmerica, "/images/UnitedStates.png");
        countryRepo.save(unitedStates);
        IslandCluster hawaii = new IslandCluster("Hawaian Islands", unitedStates, northAmerica, "/images/HawaiiIslandCluster.png", pacific);
        islandClusterRepo.save(hawaii);
        Island hawaiiMain = new Island("Hawai'i", unitedStates, northAmerica,hawaii,"/images/HawaiiIsland.png");
        islandRepo.save(hawaiiMain);
        Island mauim = new Island("Mauim O'ah", unitedStates,northAmerica,hawaii,"/images/HawaiiIsland.png");
        islandRepo.save(mauim);
        Island lanai = new Island("Lanai",unitedStates,northAmerica,hawaii,"/images/HawaiiIsland.png");
        islandRepo.save(lanai);
        Island molokai = new Island("Moloka'i",unitedStates,northAmerica,hawaii,"/images/HawaiiIsland.png");
        islandRepo.save(molokai);
        Island niihau = new Island("Ni'ihau",unitedStates,northAmerica,hawaii,"/images/HawaiiIsland.png");
        islandRepo.save(niihau);
        Island kahoolawe = new Island("Kaho'olawe",unitedStates,northAmerica,hawaii,"/images/HawaiiIsland.png");
        islandRepo.save(kahoolawe);
        Country france = new Country("France", europe, "/images.France.png");
        countryRepo.save(france);
        Country chile = new Country("Chile", southAmerica,"/images/ChileIslandCluster.png");
        countryRepo.save(chile);
        IslandCluster chileanIslands = new IslandCluster("Chilean Islands", chile,southAmerica,"/images/ChileIslandCluster.png", pacific);
        islandClusterRepo.save(chileanIslands);
        Island chanaral = new Island("Isla Chañral", chile, southAmerica, chileanIslands, "/images/ChanaralIsland.png");
        islandRepo.save(chanaral);
        Island pascua = new Island("Isla de Pascua", chile, southAmerica, chileanIslands, "/images/EasterIsland.png");
        islandRepo.save(pascua);
        Island islaRey = new Island("Isla del Rey", chile, southAmerica, chileanIslands, "/images/IslaDelReyIsland.png");
        islandRepo.save(islaRey);
        Island magdalena = new Island("Isla Magdalena", chile, southAmerica, chileanIslands, "/images/IslaMagdalenaIsland.png");
        islandRepo.save(magdalena);
        Island mancera = new Island("Isla Mancera", chile, southAmerica, chileanIslands, "/images/IslaManceraIsland.png");
        islandRepo.save(mancera);
        IslandCluster frenchCluster = new IslandCluster("French Channel", france, europe, "/images/FranceIslandCluster.png", pacific);
        islandClusterRepo.save(frenchCluster);
        Island alderney = new Island("Alderney", france, europe,frenchCluster,"/images/AlderneyIsland.png");
        islandRepo.save(alderney);
        Island guernsey = new Island("Guernsey", france, europe, frenchCluster, "/images/GuernseyIsland.png");
        islandRepo.save(guernsey);
        Island sark = new Island("Sark", france,europe,frenchCluster,"/images/SarkIsland.png");
        islandRepo.save(sark);
        Island jersey = new Island("Jersey", france,europe,frenchCluster,"/images/JerseyIsland.png");
        islandRepo.save(jersey);
        Country caboVerd = new Country("Cabo Verd", africa, "/images/CaboVerdIslandCluster.png");
        countryRepo.save(caboVerd);
        Country canada  = new Country("canada", northAmerica, "image");
        countryRepo.save(canada);
        Country mexico  = new Country("mexico", northAmerica,"image");
        countryRepo.save(mexico);
        Country ecuador  = new Country("ecuador", southAmerica, "image");
        countryRepo.save(ecuador);
        Country argentina  = new Country("argentina", southAmerica, "image");
        countryRepo.save(argentina);
        Country england  = new Country("england", europe, "image");
        countryRepo.save(england);
        Country spain  = new Country("spain", europe, "image");
        countryRepo.save(spain);
        Country unionOfTheComoros  = new Country("unionOfTheComoros", africa, "image");
        countryRepo.save(unionOfTheComoros);
        Country republicOfCapeVerde  = new Country("republicOfCapeVerde", africa, "image");
        countryRepo.save(republicOfCapeVerde);
        Country indochina  = new Country("indochina", asia, "image");
        countryRepo.save(indochina);
        Country russia  = new Country("russia", asia, "image");
        countryRepo.save(russia);
        Country fiji  = new Country("fiji", oceania, "image");
        countryRepo.save(fiji);
        Country newZealand  = new Country("newZealand", oceania, "image");
        countryRepo.save(newZealand);
        IslandCluster caboVerdCluster = new IslandCluster("Cabo Verd Islands", caboVerd, africa, "/images/CaboVerdIslandCluster.png", atlantic);
        islandClusterRepo.save(caboVerdCluster);
        Island sal = new Island("Sal", caboVerd,africa,caboVerdCluster, "/images/SalIsland.png");
        islandRepo.save(sal);
        Island boaVista = new Island("Boa Vista", caboVerd,africa,caboVerdCluster, "/images/BoaVistaIsland.png");
        islandRepo.save(boaVista);
        Island saoVicente = new Island("Sao Vicente", caboVerd,africa,caboVerdCluster, "/images/SaoVicenteIsland.png");
        islandRepo.save(saoVicente);
        Island santoAntao = new Island("Santo Antao", caboVerd, africa,caboVerdCluster,"/images/SantoAntaoIsland.png");
        islandRepo.save(santoAntao);
        Island fogo = new Island("Fogo",caboVerd,africa,caboVerdCluster, "/images/FogoIsland.png");
        islandRepo.save(fogo);
        Island santigo = new Island("Santigo", caboVerd, africa, caboVerdCluster, "/images/SantiagoIsland.png");
        islandRepo.save(santigo);
        Country philippines = new Country("Philippines", asia, "/images/philippines.png");
        countryRepo.save(philippines);
        IslandCluster elNidoCluster = new IslandCluster("El Nido Islands", philippines, asia, "/images/ElNidoIslandCluster.png", pacific);
        islandClusterRepo.save(elNidoCluster);
        Island elNido = new Island("El Nido", philippines, asia,elNidoCluster, "/images/ElNidoIsland.png");
        islandRepo.save(elNido);
        Island miniloc = new Island("Miniloc", philippines,asia,elNidoCluster,"/images/MinilocIsland.png");
        islandRepo.save(miniloc);
        Island bigLagoon = new Island("Big Lagoon", philippines, asia, elNidoCluster, "/images/BigLagoonIsland.png");
        islandRepo.save(bigLagoon);
        Island smallLagoon = new Island("Small Lagoon", philippines,asia,elNidoCluster, "/images/SmallLagoonIsland.png");
        islandRepo.save(smallLagoon);
        Island shimizu = new Island("Shimizu", philippines, asia, elNidoCluster, "/images/ShimizuIsland.png");
        islandRepo.save(shimizu);
        Island snakeIsland = new Island("Snake Island", philippines, asia, elNidoCluster, "/images/SnakeIsland.png");
        islandRepo.save(snakeIsland);
        IslandCluster queenElizabethIslandCluster = new IslandCluster("queenElizabethIslandCluster", canada, northAmerica, "image",arctic);
        islandClusterRepo.save(queenElizabethIslandCluster);
        IslandCluster mexicanIslandCluster = new IslandCluster("mexicanIslandCluster", mexico, northAmerica, "image",pacific);
        islandClusterRepo.save(mexicanIslandCluster);
        IslandCluster galapagosIslands = new IslandCluster("galapagosIslands", ecuador, southAmerica , "image",pacific);
        islandClusterRepo.save(galapagosIslands);
        IslandCluster patagonicArchipelago = new IslandCluster("patagonicArchipelago", argentina, southAmerica, "image",atlantic);
        islandClusterRepo.save(patagonicArchipelago);
        IslandCluster britishIsles = new IslandCluster("britishIsles", england, europe , "image",atlantic);
        islandClusterRepo.save(britishIsles);
        IslandCluster canaryIslands = new IslandCluster("canaryIslands", spain, europe, "image",atlantic);
        islandClusterRepo.save(canaryIslands);
        IslandCluster comorosIslands = new IslandCluster("comorosIslands", unionOfTheComoros, africa, "image",indian);
        islandClusterRepo.save(comorosIslands);
        IslandCluster capeVerdeIslands = new IslandCluster("capeVerdeIslands", republicOfCapeVerde, africa, "image",atlantic);
        islandClusterRepo.save(capeVerdeIslands);
        IslandCluster malayArchipelago = new IslandCluster("malayArchipelago", indochina, asia , "image",indian, pacific);
        islandClusterRepo.save(malayArchipelago);
        IslandCluster russianIslandCluster = new IslandCluster("russianIslandCluster", russia, asia, "image",arctic);
        islandClusterRepo.save(russianIslandCluster);
        IslandCluster onoILau = new IslandCluster("onoILau", fiji, oceania , "image",pacific);
        islandClusterRepo.save(onoILau);
        IslandCluster newZealandIslands = new IslandCluster("newZealandIslands", newZealand, oceania, "image",pacific);
        islandClusterRepo.save(newZealandIslands);





    }

}