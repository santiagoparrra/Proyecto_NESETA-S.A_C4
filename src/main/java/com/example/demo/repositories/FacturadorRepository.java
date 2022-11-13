package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.FacturadorModel;

public interface FacturadorRepository extends MongoRepository<FacturadorModel, String>  {
    
}
