package org.wecancodeit.com.project.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    private Continent continent;
    @OneToMany
    private List<IslandCluster> islandCluster;
    @OneToMany
    private List<Island> island;

    public Country(){

    }


    public Country (String name, Continent continent){
        this.name=name;
        this.continent=continent;
    }



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Continent getContinent(){
        return continent;
    }

    public Island getIsland(){
        return (Island) island;
    }
     public IslandCluster getIslandCLuster(){
        return (IslandCluster) islandCluster;
     }


}

