package org.wecancodeit.com.project.models;

import org.wecancodeit.com.project.Continent;

import javax.persistence.ManyToOne;
import javax.persistence.*;

@Entity
public class Country {
    @Id
    @GeneratedValue

    private long id;
    private String name;
    private String description;
    @ManyToOne
    private Continent continent;
    @ManyToOne
    private Island island;

    public Country(){

    }

    public Country(String name, String description, Continent continent, Island island) {
        this.name = name;
        this.description = description;
        this.continent = continent;
        this.island = island;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Continent getContinent(){
        return continent;
    }

    public Island getIsland(){
        return island;
    }


}