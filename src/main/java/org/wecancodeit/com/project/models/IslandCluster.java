package org.wecancodeit.com.project.models;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;

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
    @ManyToMany
    protected Collection<Ocean> oceans;



    public IslandCluster(){

    }

    public IslandCluster(String name, Country country, Continent continent, Ocean...oceans){
        this.name = name;
        this.country = country;
        this.continent = continent;
        this.oceans=new ArrayList<>(Arrays.asList(oceans));
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

    public Collection<Ocean> getOcean(){
        return oceans;
    }

    public Continent getContinent() {
        return continent;
    }

    public List<Island> getIslands() {
        return islands;
    }
}
