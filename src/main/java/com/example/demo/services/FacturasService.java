package com.example.demo.services;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.FacturasModel;
import com.example.demo.repositories.FacturasRepository;

@Service
public class FacturasService {
    @Autowired
    FacturasRepository facturasRepository;

    public Optional<FacturasModel> getFacturaById(String id){
        return facturasRepository.findById(id);
    }
    
    public List<FacturasModel> getFacturas() {
        List<FacturasModel> listaFacturas= facturasRepository.findAll();
        listaFacturas.sort(Comparator.comparing(FacturasModel::getId));//revisar ::
        return listaFacturas;
    }

    public String saveFactura(FacturasModel factura) {
        String actualizado = "registrada";
        if(factura.getId()!=null){
            if(facturasRepository.existsById(factura.getId())){
                actualizado = "actualizada";
            }
        }
            facturasRepository.save(factura);
            return actualizado;
    }

    public String deleteFacturaById(String id) {
        if (facturasRepository.existsById(id)) {
            facturasRepository.deleteById(id);
            return "factura Eliminada";
        } else {
            return "Error No existe ese Id";
        }
    }
}
