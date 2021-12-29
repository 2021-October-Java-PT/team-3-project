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
    private Long id;
    private String continentName;


    @OneToMany
    private List<Country> countries;
    @OneToMany
    private List<Island> island;
    @OneToMany
    private List<IslandCluster> islandCluster;

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

    //make countries getter
}
