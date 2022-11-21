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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public ArrayList<String> getProducto() {
		return producto;
	}
	public void setProducto(ArrayList<String> producto) {
		this.producto = producto;
	}
	public ArrayList<Double> getCantidad() {
		return cantidad;
	}
	public void setCantidad(ArrayList<Double> cantidad) {
		this.cantidad = cantidad;
	}
	public String getFacturador() {
		return facturador;
	}
	public void setFacturador(String facturador) {
		this.facturador = facturador;
	} 
    
    
}
