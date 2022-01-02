package org.wecancodeit.com.project.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Island {
    @Id
    @GeneratedValue
    protected Long id;

    protected String name;
    protected String description;

    @ManyToOne
    protected Country country;
    @ManyToOne
    protected Continent continent;
    @ManyToOne
    protected IslandCluster islandCluster;

    public Island(){

    }

    public Island(String name, String description, Country country, Continent continent, IslandCluster islandCluster){
        this.name=name;
        this.description=description;
        this.country=country;
        this.continent=continent;
        this.islandCluster= islandCluster;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public Country getCountry(){
        return country;
    }

    public Continent getContinent(){
        return continent;
    }

    public Long getId(){
        return id;
    }

    public IslandCluster getIslandCluster() {
        return islandCluster;
    }
}
