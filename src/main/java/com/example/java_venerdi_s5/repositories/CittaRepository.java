package com.example.java_venerdi_s5.repositories;

import com.example.java_venerdi_s5.entities.Citta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CittaRepository extends JpaRepository<Citta, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM citta WHERE nome = :n"
    )
    public List<Citta> findCittaByNome( @Param( "n" ) String n);

    public Citta findCittaById(Long id);
}
