package com.example.java_venerdi_s5.repositories;

import com.example.java_venerdi_s5.entities.Postazione;
import com.example.java_venerdi_s5.entities.Prenotazione;
import com.example.java_venerdi_s5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {


    @Query(
            value = "SELECT p FROM Prenotazione p WHERE (p.utente = :u AND p.data = :d) OR (p.postazione = :p AND " +
                    "p.data= :d)"
    )
    public List<Prenotazione> controllaValiditaPrenotazione( @Param( "u" ) Utente u, @Param( "d" ) LocalDate d,
                                                             @Param( "p" ) Postazione p);
    //se array.lenght = 0 allora posso procedere
}
