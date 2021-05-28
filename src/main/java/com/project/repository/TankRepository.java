package com.project.repository;

import com.project.domain.Tank;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.UUID;

@Repository
public interface TankRepository extends CrudRepository<Tank, UUID> {

}
