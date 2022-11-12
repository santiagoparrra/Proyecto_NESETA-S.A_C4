package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ProductoModel;
@Repository
public interface ProductoRepository extends MongoRepository<ProductoModel, String>{
    
    Iterable<ProductoModel> findByNombre(String nombre);
}
