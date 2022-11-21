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
    private String referencia;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public LocalDate getfIngreso() {
		return fIngreso;
	}
	public void setfIngreso(LocalDate fIngreso) {
		this.fIngreso = fIngreso;
	}
	public ProveedoresModel getProveedor() {
		return proveedor;
	}
	public void setProveedor(ProveedoresModel proveedor) {
		this.proveedor = proveedor;
	}
	public ArrayList<String> getDisponibles() {
		return disponibles;
	}
	public void setDisponibles(ArrayList<String> disponibles) {
		this.disponibles = disponibles;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
    
    
}
