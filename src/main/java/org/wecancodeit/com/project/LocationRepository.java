package org.wecancodeit.com.project;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.models.Location;

public interface LocationRepository extends CrudRepository<Location,Long> {
    Location findLocationByName(String name);
}
