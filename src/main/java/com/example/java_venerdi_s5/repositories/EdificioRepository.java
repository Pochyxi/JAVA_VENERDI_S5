package com.example.java_venerdi_s5.repositories;

import com.example.java_venerdi_s5.entities.Citta;
import com.example.java_venerdi_s5.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM edifici WHERE nome = :n"
    )
    public List<Citta> findEdificioByNome( @Param( "n" ) String n);

    public Edificio findEdificioById(Long id);
}
