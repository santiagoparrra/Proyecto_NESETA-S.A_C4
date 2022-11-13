package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.FacturadorModel;
import com.example.demo.services.FacturadorService;

@RestController
@RequestMapping("/facturador")
public class FacturadorController {
    @Autowired
    FacturadorService facturadorService;

    @GetMapping()
    public List<FacturadorModel> getAllFacturadores(){
        return facturadorService.getFacturadores();
    }

    @GetMapping(path = "/{id}")
    public Optional<FacturadorModel> getFacturadorById(@PathVariable("id") String id){
        return facturadorService.getFacturadorById(id);
    }

    @PostMapping()
    public FacturadorModel saveFacturador(@RequestBody FacturadorModel facturador){
        return facturadorService.saveFacturador(facturador);
    }

}
