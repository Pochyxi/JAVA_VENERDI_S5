package com.example.java_venerdi_s5.services;

import com.example.java_venerdi_s5.entities.Citta;
import com.example.java_venerdi_s5.repositories.CittaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CittaService {

    @Autowired
    CittaRepository cittaRepository;

    public List<Citta> getAll() {
        return cittaRepository.findAll();
    }

    public Citta getCittaById(Long id) {
        return cittaRepository.findById(id).isPresent() ? cittaRepository.findById(id).get() : null;
    }

    public void addCitta( Citta citta ) {
        cittaRepository.save(citta);
    }
}
