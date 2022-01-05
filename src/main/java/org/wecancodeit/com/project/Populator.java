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
        Country austrailia = new Country("austrailia", oceania,  "/images/Australia.png");
        countryRepo.save(austrailia);

        Country southAfrica = new Country("South Africa", africa, "/images/South Africa.png");
        countryRepo.save(southAfrica);
        Country unitedStates = new Country("United States", northAmerica, "/images/UnitedStates.png");
        countryRepo.save(unitedStates);
        Country france = new Country("France", europe, "/images.France.png");
        countryRepo.save(france);
        Country chile = new Country("Chile", southAmerica,"/images/ChileIslandCluster.png");
        countryRepo.save(chile);
        Country caboVerd = new Country("Cabo Verd", africa, "/images/CaboVerdIslandCluster.png");
        countryRepo.save(caboVerd);
        Country canada  = new Country("canada", northAmerica, "/images/Canada.png");
        countryRepo.save(canada);
        Country mexico  = new Country("mexico", northAmerica,"/images/NorthAmericaContinent.png");
        countryRepo.save(mexico);
        Country ecuador  = new Country("ecuador", southAmerica, "/images/Ecuador.png");
        countryRepo.save(ecuador);
        Country argentina  = new Country("argentina", southAmerica, "/images/Argentina.png");
        countryRepo.save(argentina);
        Country unitedKingdom  = new Country("unitedKingdom", europe, "/images/England.png");
        countryRepo.save(unitedKingdom);
        Country spain  = new Country("spain", europe, "/images/Spain.png");
        countryRepo.save(spain);
        Country unionOfTheComoros  = new Country("unionOfTheComoros", africa, "/images/Comoros.png");
        countryRepo.save(unionOfTheComoros);
        Country republicOfCapeVerde  = new Country("republicOfCapeVerde", africa, "image");
        countryRepo.save(republicOfCapeVerde);
        Country indochina  = new Country("indochina", asia, "image");
        countryRepo.save(indochina);
        Country russia  = new Country("russia", asia, "/images/Russia.png");
        countryRepo.save(russia);
        Country fiji  = new Country("fiji", oceania, "/images/Fiji.png");
        countryRepo.save(fiji);
        Country newZealand  = new Country("newZealand", oceania, "/images/NewZealand.png");
        countryRepo.save(newZealand);
        Country philippines = new Country("Philippines", asia, "/images/philippines.png");
        countryRepo.save(philippines);
        IslandCluster austrailianIslands = new IslandCluster("austrailianIslands", austrailia, oceania, "/images/AustraliaIslandCluster.png");
        islandClusterRepo.save(austrailianIslands);
        IslandCluster caboVerdCluster = new IslandCluster("Cabo Verd Islands", caboVerd, africa, "/images/CaboVerdIslandCluster.png", atlantic);
        islandClusterRepo.save(caboVerdCluster);
        IslandCluster tristanDaCunah = new IslandCluster("Tristan da Cunah", southAfrica, africa, "images/island.png", atlantic , indian);
        islandClusterRepo.save(tristanDaCunah);

        IslandCluster hawaii = new IslandCluster("Hawaian Islands", unitedStates, northAmerica, "/images/HawaiiIslandCluster.png", pacific);
        islandClusterRepo.save(hawaii);
        IslandCluster chileanIslands = new IslandCluster("Chilean Islands", chile,southAmerica,"/images/ChileIslandCluster.png", pacific);
        islandClusterRepo.save(chileanIslands);
        IslandCluster elNidoCluster = new IslandCluster("El Nido Islands", philippines, asia, "/images/ElNidoIslandCluster.png", pacific);
        islandClusterRepo.save(elNidoCluster);
        IslandCluster queenElizabethIslandCluster = new IslandCluster("queenElizabethIslandCluster", canada, northAmerica, "/images/CanadaIslandCluster.png",arctic);
        islandClusterRepo.save(queenElizabethIslandCluster);
        IslandCluster mexicanIslandCluster = new IslandCluster("mexicanIslandCluster", mexico, northAmerica, "/images/MexicoIslandCluster.png",pacific);
        islandClusterRepo.save(mexicanIslandCluster);
        IslandCluster galapagosIslands = new IslandCluster("galapagosIslands", ecuador, southAmerica , "/images/EcuadorIslandCluster.png",pacific);
        islandClusterRepo.save(galapagosIslands);
        IslandCluster patagonicArchipelago = new IslandCluster("patagonicArchipelago", argentina, southAmerica, "/images/ArgentinaIslandCluster.png",atlantic);
        islandClusterRepo.save(patagonicArchipelago);
        IslandCluster britishIsles = new IslandCluster("britishIsles", unitedKingdom, europe , "/images/EnglandIslandCluster.png",atlantic);
        islandClusterRepo.save(britishIsles);
        IslandCluster canaryIslands = new IslandCluster("canaryIslands", spain, europe, "/images/SpainIslandCluster.png",atlantic);
        islandClusterRepo.save(canaryIslands);
        IslandCluster comorosIslands = new IslandCluster("comorosIslands", unionOfTheComoros, africa, "/images/ComorosIslandCluster.png",indian);
        islandClusterRepo.save(comorosIslands);
        IslandCluster capeVerdeIslands = new IslandCluster("capeVerdeIslands", republicOfCapeVerde, africa, "image",atlantic);
        islandClusterRepo.save(capeVerdeIslands);
        IslandCluster malayArchipelago = new IslandCluster("malayArchipelago", indochina, asia , "image",indian, pacific);
        islandClusterRepo.save(malayArchipelago);
        IslandCluster russianIslandCluster = new IslandCluster("russianIslandCluster", russia, asia, "/images/RussiaIslandCluster.png",arctic);
        islandClusterRepo.save(russianIslandCluster);
        IslandCluster onoILau = new IslandCluster("onoILau", fiji, oceania , "/images/FijiIslandCluster.png",pacific);
        islandClusterRepo.save(onoILau);
        IslandCluster newZealandIslands = new IslandCluster("newZealandIslands", newZealand, oceania, "/images/NewZealandIslandCluster.png",pacific);
        islandClusterRepo.save(newZealandIslands);
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

        Island edinburgh =new Island("Edinburgh of the Seven Seas", southAfrica,africa,tristanDaCunah,"/images/island.png");
        islandRepo.save(edinburgh);
        Island kagarooIsland =new Island("Kagaroo Island", austrailia, oceania, austrailianIslands,"/images/KangarooIsland.png");
        islandRepo.save(kagarooIsland);
        Island brunyIsland =new Island("Bruny Island", austrailia, oceania, austrailianIslands,"/images/BrunyIsland.png");
        islandRepo.save(brunyIsland);
        Island findersIsland =new Island("Finders Island", austrailia, oceania, austrailianIslands,"/images/FlindersIsland.png");
        islandRepo.save(findersIsland);
        Island ellesmereIsland = new Island("ellesmereIsland", canada , northAmerica , queenElizabethIslandCluster,"image");
        islandRepo.save(ellesmereIsland);
        Island amundRingnesIsland = new Island("amundRingnesIsland",canada , northAmerica , queenElizabethIslandCluster ,"image");
        islandRepo.save(amundRingnesIsland);
        Island bathurstIsland = new Island("bathurstIsland",canada , northAmerica , queenElizabethIslandCluster ,"image");
        islandRepo.save(bathurstIsland);
        Island cedros = new Island("cedros", mexico , northAmerica , mexicanIslandCluster,"image");
        islandRepo.save(cedros);
        Island islaGrande = new Island("islaGrande", mexico , northAmerica , mexicanIslandCluster,"image");
        islandRepo.save(islaGrande);
        Island islaSanMartin = new Island("islaSanMartin", mexico , northAmerica , mexicanIslandCluster,"image");
        islandRepo.save(islaSanMartin);
        Island santiagoIsland = new Island("santiagoIsland",ecuador , southAmerica, galapagosIslands,"/images/SantiagoIsland.png");
        islandRepo.save(santiagoIsland);
        Island isabelaIsland = new Island("isabelaIsland",ecuador , southAmerica, galapagosIslands,"image");
        islandRepo.save(isabelaIsland);
        Island wolfIsland = new Island("wolfIsland",ecuador , southAmerica, galapagosIslands,"image");
        islandRepo.save(wolfIsland);
        Island islaGrandeDeTierraDelFuego = new Island("islaGrandeDeTierraDelFuego", argentina , southAmerica , patagonicArchipelago ,"image");
        islandRepo.save(islaGrandeDeTierraDelFuego);
        Island islaDeLosEstados = new Island("islaDeLosEstados", argentina , southAmerica , patagonicArchipelago ,"image");
        islandRepo.save(islaDeLosEstados);
        Island islasMalvinas = new Island("islasMalvinas", argentina , southAmerica , patagonicArchipelago ,"image");
        islandRepo.save(islasMalvinas);
        Island greatBritain = new Island("greatBritain", unitedKingdom, europe, britishIsles,"image");
        islandRepo.save(greatBritain);
        Island ireland = new Island("ireland", unitedKingdom, europe, britishIsles,"image");
        islandRepo.save(ireland);
        Island isleOfMan = new Island("isleOfMan", unitedKingdom , europe, britishIsles,"image");
        islandRepo.save(isleOfMan);
        Island tenerife = new Island("tenerife", spain, europe, canaryIslands,"image");
        islandRepo.save(tenerife);
        Island granCanaria = new Island("granCanaria", spain, europe, canaryIslands,"image");
        islandRepo.save(granCanaria);
        Island laPalma = new Island("laPalma", spain, europe, canaryIslands,"image");
        islandRepo.save(laPalma);
        Island grandeComore = new Island("grandeComore", unionOfTheComoros, africa, comorosIslands,"image");
        islandRepo.save(grandeComore);
        Island moheli = new Island("moheli", unionOfTheComoros, africa, comorosIslands,"image");
        islandRepo.save(moheli);
        Island anjouan = new Island("anjouan", unionOfTheComoros, africa, comorosIslands,"image");
        islandRepo.save(anjouan);

        Island brava = new Island("brava", republicOfCapeVerde, africa, capeVerdeIslands,"image");
        islandRepo.save(brava);

        Island brunei = new Island("brunei", indochina, asia, malayArchipelago,"image");
        islandRepo.save(brunei);
        Island eastTimor = new Island("eastTimor", indochina, asia, malayArchipelago,"image");
        islandRepo.save(eastTimor);
        Island indonesia = new Island("indonesia", indochina, asia, malayArchipelago,"image");
        islandRepo.save(indonesia);
        Island malaysia = new Island("malaysia", indochina, asia, malayArchipelago,"image");
        islandRepo.save(malaysia);
        Island victoriaIsland = new Island("victoriaIsland", russia, asia, russianIslandCluster,"image");
        islandRepo.save(victoriaIsland);
        Island franzJosefLand = new Island("franzJosefLand", russia, asia, russianIslandCluster,"image");
        islandRepo.save(franzJosefLand);
        Island oleniyIsland = new Island("oleniyIsland", russia, asia, russianIslandCluster,"image");
        islandRepo.save(oleniyIsland);
        Island vitiLevu = new Island("vitiLevu", fiji, oceania, onoILau,"image");
        islandRepo.save(vitiLevu);
        Island vanuaLevu = new Island("vanuaLevu", fiji, oceania, onoILau,"image");
        islandRepo.save(vanuaLevu);
        Island southIsland = new Island("southIsland", newZealand, oceania, newZealandIslands,"image");
        islandRepo.save(southIsland);
        Island northIsland = new Island("northIsland", newZealand, oceania, newZealandIslands,"image");
        islandRepo.save(northIsland);
        Island aucklandIsland = new Island("aucklandIsland", newZealand, oceania, newZealandIslands,"image");
        islandRepo.save(aucklandIsland);






    }

}
