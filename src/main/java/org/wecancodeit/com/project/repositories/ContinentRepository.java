package org.wecancodeit.com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.models.Continent;
import org.wecancodeit.com.project.models.IslandCluster;

import java.util.HashMap;
import java.util.Map;

public interface ContinentRepository extends CrudRepository<Continent, Long> {

    Map<Long, Continent> continentList = new HashMap<>();


    default Continent findOne(Long id) {
        return continentList.get(id);
    }

}
