package org.wecancodeit.com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.models.IslandCluster;

import java.util.HashMap;
import java.util.Map;

public interface IslandClusterRepository extends CrudRepository<IslandCluster, Long> {

    Map<Long, IslandCluster> islandClusterList = new HashMap<>();


    default IslandCluster findOne(Long id){
        return islandClusterList.get(id);
    }


}
