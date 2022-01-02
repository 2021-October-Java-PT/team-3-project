package org.wecancodeit.com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    protected Long id;
    protected String continentName;


    @OneToMany(mappedBy = "continent")
    protected List<Country> countries;
    @OneToMany(mappedBy = "islandCluster")
    protected List<Island> island;
    @OneToMany(mappedBy = "country")
    protected List<IslandCluster> islandClusters;

    public Continent(){

    }

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public Long getId() {
        return id;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries(){
        return countries;
    }

}
