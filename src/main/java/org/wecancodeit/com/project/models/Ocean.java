package org.wecancodeit.com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ocean {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    public Ocean(){

    }

    public Ocean (String name){
        this.name=name;
    }


    public Long getId(){
        return id;
    }

}
