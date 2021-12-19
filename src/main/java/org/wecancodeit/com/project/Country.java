package org.wecancodeit.com.project;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Country {
    @Id
    @GeneratedValue

    private long id;
    private String name;

    public Country(String name){
        this.name=name;
    }
    public long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

}
