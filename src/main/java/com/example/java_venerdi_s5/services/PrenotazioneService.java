package com.example.java_venerdi_s5.services;

import com.example.java_venerdi_s5.entities.Postazione;
import com.example.java_venerdi_s5.entities.Prenotazione;
import com.example.java_venerdi_s5.entities.Utente;
import com.example.java_venerdi_s5.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {
    @Autowired
    PrenotazioneRepository prenotazioneRepository;

    public List<Prenotazione> findAll() {
        return prenotazioneRepository.findAll();
    }

    public void addPrenotazione(Prenotazione p) {
        prenotazioneRepository.save(p);
    }

    public List<Prenotazione> controllaValiditaPrenotazione( Utente u, LocalDate ld, Postazione p ) {
        return prenotazioneRepository.controllaValiditaPrenotazione( u, ld, p );
    }

    public Prenotazione findPrenotazioneById(Long id) {
        return prenotazioneRepository.findById(id).isPresent() ? prenotazioneRepository.findById(id).get() : null;
    }
}
