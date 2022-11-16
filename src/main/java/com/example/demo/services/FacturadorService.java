package com.example.demo.services;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.FacturadorModel;
import com.example.demo.repositories.FacturadorRepository;

@Service
public class FacturadorService {
    @Autowired
    FacturadorRepository facturadorRepository;

    public Optional<FacturadorModel> getFacturadorById(String id){
        return facturadorRepository.findById(id);
    }
    
    public List<FacturadorModel> getFacturadores() {
        List<FacturadorModel> listaFacturadores= facturadorRepository.findAll();
        listaFacturadores.sort(Comparator.comparing(FacturadorModel::getId));//revisar ::
        return listaFacturadores;
    }

    public String saveFacturador(FacturadorModel facturador) {
        String actualizado = "registrado";
        if(facturador.getId()!=null){
            if(facturadorRepository.existsById(facturador.getId())){
                actualizado = "actualizado";
            }
        }
            facturadorRepository.save(facturador);
            return actualizado;
    }
}
