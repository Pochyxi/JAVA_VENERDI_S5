package com.example.java_venerdi_s5.services;

import com.example.java_venerdi_s5.entities.Utente;
import com.example.java_venerdi_s5.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteService {

    @Autowired
    UtenteRepository utenteRepository;

    public List<Utente> getAll() {
        return utenteRepository.findAll();
    }

    public void addUtente(Utente u) {
        utenteRepository.save(u);
    }

    public Utente getUtenteById(Long id) {
        return utenteRepository.findById(id).isPresent() ? utenteRepository.findById(id).get() : null;
    }
}
