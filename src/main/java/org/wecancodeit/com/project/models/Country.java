package org.wecancodeit.com.project.models;

import javax.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    private Continent continent;
    @OneToMany
    private IslandCluster islandCluster;
    @OneToMany
    private Island island;

    public Country(){

    }


    public Country (String name, Continent continent){
        this.name=name;
        this.continent=continent;
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

