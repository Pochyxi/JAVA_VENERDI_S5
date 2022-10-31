package com.example.java_venerdi_s5.controllers;

import com.example.java_venerdi_s5.entities.Prenotazione;
import com.example.java_venerdi_s5.entities.Utente;
import com.example.java_venerdi_s5.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PrenotazioniController {

    @Autowired
    PrenotazioneService ps;

    @GetMapping("/api/prenotazioni")
    public List<Prenotazione> getAllUsers(){

        return ps.findAll();
    }
}
