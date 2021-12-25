package org.wecancodeit.com.project.repositories;

import org.springframework.data.repository.CrudRepository;

import org.wecancodeit.com.project.models.Ocean;

public interface OceanRepository extends CrudRepository<Ocean,Long> {
    Ocean findOcean(Long id);

}
