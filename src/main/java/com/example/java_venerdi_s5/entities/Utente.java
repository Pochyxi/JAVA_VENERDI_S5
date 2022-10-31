package com.example.java_venerdi_s5.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "utenti")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String nomeCompleto;
    private String email;

    @OneToMany(mappedBy = "utente")
    @ToString.Exclude
    @JsonBackReference
    List<Prenotazione> prenotazioni;


}
