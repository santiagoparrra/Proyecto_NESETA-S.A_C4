package com.example.demo.models;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FacturadorModel {
    @Id
    private String id;
    private String nombre;
    private String telefono;
    private String correo;
    private String usuario;
    private String contraseña;
    private String estado; //habilitado o deshabilitado 
}
