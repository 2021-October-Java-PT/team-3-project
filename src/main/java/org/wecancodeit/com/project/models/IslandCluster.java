package org.wecancodeit.com.project.models;


import javax.persistence.*;

@Entity

public class IslandCluster {
    @Id
    @GeneratedValue
    private String islandClusterName;
    private Long id;

    @OneToMany
    private Island island;
    @OneToOne
    private Country country;
    @OneToOne
    private Continent continent;


    public IslandCluster(){

    }

    public IslandCluster(Long id, String islandClusterName, Country country, Continent continent){
        this.id = id;
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
        return island;
    }

    public Country getCountry() {
        return country;
    }

    public Continent getContinent() {
        return continent;
    }
}
