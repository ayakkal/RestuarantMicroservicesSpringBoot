package com.example.restuarant.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.restuarant.model.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
	List<Reservation> findByNameContaining(String name);
}
