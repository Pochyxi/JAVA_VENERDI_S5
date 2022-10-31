package com.example.java_venerdi_s5.services;

import com.example.java_venerdi_s5.entities.Citta;
import com.example.java_venerdi_s5.entities.Postazione;
import com.example.java_venerdi_s5.entities.Tipo;
import com.example.java_venerdi_s5.entities.Utente;
import com.example.java_venerdi_s5.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    PostazioneRepository postazioneRepository;

    public List<Postazione> getAll() {
        return postazioneRepository.findAll();
    }

    public void addPostazione(Postazione p) {
        postazioneRepository.save(p);
    }

    public List<Postazione> findPostazioneByTipoAndCitta( Tipo tipo, Citta citta) {
        return postazioneRepository.findPostazioneByTipoAndCitta( tipo, citta );
    }

    public Postazione getPostazioneById( Long id) {
        return postazioneRepository.findById(id).isPresent() ? postazioneRepository.findById(id).get() : null;
    }
}
