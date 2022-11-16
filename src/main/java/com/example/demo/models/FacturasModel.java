package com.example.demo.models;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("facturas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FacturasModel {
    @Id
    private String id;
    private String id_cliente;
    private LocalDate fecha;
    private ArrayList<String> producto;
    private ArrayList<Double> cantidad;
    private String facturador; 
}
