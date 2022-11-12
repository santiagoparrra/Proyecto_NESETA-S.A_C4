package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ProductoModel;
import com.example.demo.services.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping()
    public List<ProductoModel> getAllProductos(){
        return productoService.getProductos();
    }

    @GetMapping(path = "/{id}")
    public Optional<ProductoModel> getProductoById(@PathVariable("id") String id){
        return productoService.getpProductoById(id);
    }

    @PostMapping()
    public ProductoModel saveProducto(@RequestBody ProductoModel producto){
        return productoService.saveProducto(producto);
    }

    @DeleteMapping(path = "/{identificador}")
    public String deleteProductoById(@PathVariable("identificador") String id){
        return productoService.deleteProductoById(id);
    }

    @GetMapping(path = "/{nombre}")
    public Iterable<ProductoModel> buscarPorNombre(@PathVariable("nombre")String nombre){
        return productoService.getProductobyNombre(nombre);
    }
}
