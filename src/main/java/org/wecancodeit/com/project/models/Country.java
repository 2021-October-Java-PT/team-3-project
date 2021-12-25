package org.wecancodeit.com.project.models;


import javax.persistence.*;

@Entity
public class Country {
    @Id
    @GeneratedValue

    private Long id;
    private String name;

    @OneToOne
    private Continent continent;
    @OneToMany
    private IslandCluster islandCluster;
    @OneToMany
    private Island island;

    public Country(Long id, String name, Continent continent){
        this.name=name;
        this.id=id;
        this.continent=continent;
    }
    public long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

}
