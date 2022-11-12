package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.FacturasModel;

@Repository
public interface FacturasRepository extends MongoRepository<FacturasModel, String> {
    
}
