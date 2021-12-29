package org.wecancodeit.com.project.models;


import javax.persistence.*;
import java.util.List;

@Entity

public class IslandCluster {
    @Id
    @GeneratedValue
    private Long id;
    private String islandClusterName;

    @ManyToMany
    private List<Island> island;
    @ManyToOne
    private Country country;
    @ManyToOne
    private Continent continent;


    public IslandCluster(){

    }

    public IslandCluster(String islandClusterName, Country country, Continent continent){
        this.islandClusterName = islandClusterName;
        this.country = country;
        this.continent = continent;
    }

    public String getIslandClusterName() {
        return islandClusterName;
    }

    public Long getId() {
        return id;
    }

    public Island getIsland() {
        return (Island) island;
    }

    public Country getCountry() {
        return country;
    }

    public Continent getContinent() {
        return continent;
    }
}
