package com.example.restuarant.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.restuarant.model.Menu;

@Repository
public interface MenuRepository extends MongoRepository<Menu, String> {
	List<Menu> findByNameContaining(String name);
	Optional<Menu> findByItemCode(String id);
}
