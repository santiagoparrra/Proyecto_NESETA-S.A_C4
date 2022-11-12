package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ProveedoresModel {
    private String nombre;
    private int telefono;
    private String direccion;
    private String ciudad;
}
