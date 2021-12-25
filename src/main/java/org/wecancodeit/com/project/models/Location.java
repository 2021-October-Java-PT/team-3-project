package org.wecancodeit.com.project.models;


import org.wecancodeit.com.project.Continent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Location {
    @Id
    @GeneratedValue

    private long id;
    private String name;
    private String description;
    @ManyToOne
    private Continent continent;
    @ManyToOne
    private Country country;
    @ManyToOne
    private Island island;

    public Location(){

    }

    public Location(String name, String description, Continent continent, Country country, Island island) {
        this.name = name;
        this.description = description;
        this.continent = continent;
        this.country = country;
        this.island = island;

    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String description(){
        return description;
    }

    public Continent getContinent(){
        return continent;
    }

    public Country getCountry(){
        return country;
    }

    public Island getIsland(){
        return island;
    }





}

