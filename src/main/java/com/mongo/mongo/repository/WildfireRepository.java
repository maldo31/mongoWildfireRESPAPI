package com.mongo.mongo.repository;

import com.mongo.mongo.model.Wildfire;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WildfireRepository extends MongoRepository<Wildfire,String> {
    Wildfire findWildfireBy_id(String id);
}
