package org.wecancodeit.com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Long id;
    private String continentName;


    @OneToMany
    private Country country;
    @OneToMany
    private Island island;
    @OneToMany
    private IslandCluster islandCluster;

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
}
