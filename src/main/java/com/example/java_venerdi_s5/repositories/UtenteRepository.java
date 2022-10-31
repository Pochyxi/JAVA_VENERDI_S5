package com.example.java_venerdi_s5.repositories;

import com.example.java_venerdi_s5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
