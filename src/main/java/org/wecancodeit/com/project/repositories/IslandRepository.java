package org.wecancodeit.com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.models.Island;

import java.util.HashMap;
import java.util.Map;

public interface IslandRepository extends CrudRepository<Island, Long> {

    Map<Long, Island> islandList = new HashMap<>();


    default Island findOne(Long id){
        return islandList.get(id);
    }
}
