package com.example.java_venerdi_s5.repositories;

import com.example.java_venerdi_s5.entities.Citta;
import com.example.java_venerdi_s5.entities.Postazione;
import com.example.java_venerdi_s5.entities.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM postazioni WHERE tipo = :n"
    )
    public List<Postazione> findPostazioneByTipo( @Param( "n" ) Tipo n);

    @Query(
            value = "SELECT p FROM Postazione p WHERE p.tipo = :t AND p.edificio.citta = :c"
    )
    public List<Postazione> findPostazioneByTipoAndCitta( @Param( "t") Tipo t, @Param( "c" ) Citta c);


}
