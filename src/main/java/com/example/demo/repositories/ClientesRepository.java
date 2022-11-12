package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ClientesModel;

@Repository
public interface ClientesRepository extends MongoRepository<ClientesModel, String>  {
    
}
