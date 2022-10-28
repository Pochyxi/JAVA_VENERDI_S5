package com.example.java_venerdi_s5.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String nomeCompleto;
    private String email;

    @OneToMany(mappedBy = "user")
    @ToString.Exclude
    List<Prenotazione> prenotazioni;


}
