package org.wecancodeit.com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Set;

@Entity
public class Ocean {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    protected String imagePath;


    @ManyToMany(mappedBy = "oceans")
    protected Collection<IslandCluster> islandClusters;



    public Ocean(){

    }

    public Ocean (String name, String imagePath){

        this.name=name;
        this.imagePath=imagePath;
    }


    public Long getId(){
        return id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getName() {
        return name;
    }

    public Collection<IslandCluster> getIslandClusters() {
        return islandClusters;
    }
}
