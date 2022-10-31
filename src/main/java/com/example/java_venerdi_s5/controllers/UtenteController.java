package com.example.java_venerdi_s5.controllers;

import com.example.java_venerdi_s5.entities.Utente;
import com.example.java_venerdi_s5.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UtenteController {

    @Autowired
    UtenteService us;

    @GetMapping("/")
    public String index() {
        return "ciao sono la homepage";
    }

    @GetMapping("/api/utenti")
    public List<Utente> getAllUsers(){

        return us.getAll();
    }
}
