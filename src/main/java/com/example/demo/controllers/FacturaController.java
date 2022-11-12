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

import com.example.demo.models.FacturasModel;
import com.example.demo.services.FacturasService;

@RestController
@RequestMapping("/facturas")
public class FacturaController {
    @Autowired
    FacturasService facturaService;

    @GetMapping()
    public List<FacturasModel> getAllFacturas(){
        return facturaService.getFacturas();
    }

    @GetMapping(path = "/{id}")
    public Optional<FacturasModel> getFacturaById(@PathVariable("id") String id){
        return facturaService.getFacturaById(id);
    }

    @PostMapping()
    public FacturasModel saveFactura(@RequestBody FacturasModel factura){
        return facturaService.saveFactura(factura);
    }

    @DeleteMapping(path = "/{identificador}")
    public String deleteFacturaById(@PathVariable("identificador") String id){
        return facturaService.deleteFacturaById(id);
    }
}
