package org.wecancodeit.com.project.models;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class IslandCluster {
    @Id
    @GeneratedValue
    protected Long id;
    protected String name;

    @OneToMany(mappedBy = "islandCluster")
    protected List<Island> islands;
    @ManyToOne
    protected Country country;
    @ManyToOne
    protected Continent continent;


    public IslandCluster(){

    }

    public IslandCluster(String name, Country country, Continent continent){
        this.name = name;
        this.country = country;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public List<Island> getIsland() {
        return islands;
    }

    public Country getCountry() {
        return country;
    }

    public Continent getContinent() {
        return continent;
    }

    public List<Island> getIslands() {
        return islands;
    }
}
