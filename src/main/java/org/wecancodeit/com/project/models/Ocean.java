package org.wecancodeit.com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Ocean {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


//    @ManyToMany(mappedBy = "islandCluster")
//    protected Set<IslandCluster> islandClusters;



    public Ocean(){

    }

    public Ocean (String name){
        this.name=name;
    }


    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

//    public Set<IslandCluster> getIslandClusters() {
//        return islandClusters;
//    }
}
