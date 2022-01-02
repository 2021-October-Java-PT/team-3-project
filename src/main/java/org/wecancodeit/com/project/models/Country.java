package org.wecancodeit.com.project.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Country {

    @Id
    @GeneratedValue
    protected Long id;
    protected String name;

    @OneToMany(mappedBy = "country")
    protected List<IslandCluster> islandClusters;
    @OneToMany(mappedBy = "islandCluster")
    protected List<Island> island;
    @ManyToOne
    protected Continent continent;

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

     public List<IslandCluster> getIslandCLusters(){
        return islandClusters;
     }


}

