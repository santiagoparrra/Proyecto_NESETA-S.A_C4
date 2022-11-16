package com.example.demo.services;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ProductoModel;
import com.example.demo.repositories.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public Optional<ProductoModel> getpProductoById(String id){
        return productoRepository.findById(id);
    }

    public Iterable<ProductoModel> getProductobyNombre(String nombre){
        return productoRepository.findByNombre(nombre);
    }
    
    public List<ProductoModel> getProductos() {
        List<ProductoModel> listaProductos= productoRepository.findAll();
        listaProductos.sort(Comparator.comparing(ProductoModel::getNombre));
        return listaProductos;
    }

    public String saveProducto(ProductoModel producto) {

        /* producto.setNombre(producto.getNombre().toLowerCase());
        producto.setMarca(producto.getMarca().toLowerCase()); */

        String actualizado = "registrado";
        if(producto.getId()!=null){
            if(productoRepository.existsById(producto.getId())){
                actualizado = "actualizado";
            }
        }
            productoRepository.save(producto);
            return actualizado;
        }

    public String deleteProductoById(String id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return "producto Eliminado";
        } else {
            return "Error No existe ese Id";
        }

    }

    public void deletedAllProductos(){
        productoRepository.deleteAll();
    }
}
