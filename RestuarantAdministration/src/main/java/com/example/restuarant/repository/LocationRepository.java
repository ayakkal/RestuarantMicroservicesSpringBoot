package com.example.restuarant.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.restuarant.model.Location;

@Repository
public interface LocationRepository extends MongoRepository<Location, String> {
	List<Location> findByNameContaining(String name);
	Optional<Location> findByLocationId(String id);
}
