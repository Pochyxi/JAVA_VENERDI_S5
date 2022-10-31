package com.example.java_venerdi_s5.services;

import com.example.java_venerdi_s5.entities.Citta;
import com.example.java_venerdi_s5.entities.Edificio;
import com.example.java_venerdi_s5.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {

    @Autowired
    EdificioRepository edificioRepository;

    public List<Edificio> getAll() {
        return edificioRepository.findAll();
    }

    public void addEdificio(Edificio e) {
        edificioRepository.save(e);
    }

   public Edificio findEdificioById(Long id) {
        return edificioRepository.findEdificioById( id );
   }

}
