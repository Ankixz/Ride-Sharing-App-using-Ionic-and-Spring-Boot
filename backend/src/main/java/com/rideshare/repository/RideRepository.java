package com.rideshare.repository;

import com.rideshare.model.Ride;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends MongoRepository<Ride, String> {
}
