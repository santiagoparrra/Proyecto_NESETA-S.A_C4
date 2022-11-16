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

import com.example.demo.models.ClientesModel;
import com.example.demo.services.ClientesService;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClientesService clienteService;

    @GetMapping()
    public List<ClientesModel> getAllClientes(){
        return clienteService.getClientes();
    }

    @GetMapping(path = "/{id}")
    public Optional<ClientesModel> getClienteById(@PathVariable("id") String id){
        return clienteService.getClienteById(id);
    }

    @PostMapping()
    public String saveCliente(@RequestBody ClientesModel cliente){
        return clienteService.saveCliente(cliente);
    }

    @DeleteMapping(path = "/{identificador}")
    public String deleteClienteById(@PathVariable("identificador") String id){
        return clienteService.deleteClienteById(id);
    }
}
