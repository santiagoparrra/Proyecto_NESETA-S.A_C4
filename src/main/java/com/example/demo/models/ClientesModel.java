package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("clientes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClientesModel {
    @Id
    private String id;
    private String nombre;
	private String nit;
    private String celular;
    private String correo;
	private String direccion;
}
