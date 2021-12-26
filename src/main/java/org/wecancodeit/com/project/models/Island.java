package org.wecancodeit.com.project.models;


import org.wecancodeit.com.project.Continent;
import org.wecancodeit.com.project.Country;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Island {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @ManyToOne
    private Country country;
    @ManyToOne
    private Continent continent;

    public Island(){

    }

    public Island(String name, String description, Country country, Continent continent){
        this.name=name;
        this.description=description;
        this.country=country;
        this.continent=continent;
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

}
