package org.wecancodeit.com.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Continent(){

    }

    public Continent(String name) {
        this.name = name;
    }
}
