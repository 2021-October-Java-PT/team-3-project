package org.wecancodeit.com.project.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


@Entity
public class Package {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @OneToMany
    private Collection<Island> islands;

    public Package() {

    }

    public Package(String name, String description, Island... islands) {
        this.name = name;
        this.description = description;
        this.islands = new ArrayList<>(Arrays.asList(islands));

    }

    public Collection<Island> getIslands() {
        return islands;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public Long getId() {
        return id;
    }

}


