package com.example.java_venerdi_s5.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "edifici")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nome;
    private String indirizzo;

    @ManyToOne
    @JoinColumn(name = "citta_id")
    private Citta citta;

    @OneToMany(mappedBy = "edificio")
    @ToString.Exclude
    List<Postazione> postazioni;


}
