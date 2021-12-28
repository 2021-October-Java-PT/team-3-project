package org.wecancodeit.com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.models.Country;

import java.util.HashMap;
import java.util.Map;

public interface CountryRepository extends CrudRepository<Country,Long> {
    Map<Long, Country> countryList = new HashMap<>();

    default Country findOne(Long id) {
        return countryList.get(id);
    }
}
