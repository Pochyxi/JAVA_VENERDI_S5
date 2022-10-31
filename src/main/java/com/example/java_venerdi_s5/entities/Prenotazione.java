package com.example.java_venerdi_s5.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate data;

    @OneToOne
    @JsonBackReference
    private Postazione postazione;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "utente_id")
    private Utente utente;
}
