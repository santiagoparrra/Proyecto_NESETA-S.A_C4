package com.example.demo.models;

import java.time.LocalDate;

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
    private String id_cliente;
    private LocalDate fecha;
    private String producto1;
    private int cantidad1;
    private FacturadorModel facturador; 
}
