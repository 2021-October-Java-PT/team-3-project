package org.wecancodeit.com.project.repositories;

import org.springframework.data.repository.CrudRepository;

import org.wecancodeit.com.project.models.Country;
import org.wecancodeit.com.project.models.Ocean;

import java.util.HashMap;
import java.util.Map;

public interface OceanRepository extends CrudRepository<Ocean,Long> {
    Map<Long, Ocean> oceanList = new HashMap<>();

    default Ocean findOne(Long id) {
        return oceanList.get(id);
    }

}
