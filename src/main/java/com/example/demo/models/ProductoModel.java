package com.example.demo.models;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("productos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductoModel {
    @Id
    private String id;
    private String nombre;
    private int precio;
    private String marca;
    private String color;
    private LocalDate fIngreso;
    private ProveedoresModel proveedor;
    private ArrayList<String> disponibles;
}
