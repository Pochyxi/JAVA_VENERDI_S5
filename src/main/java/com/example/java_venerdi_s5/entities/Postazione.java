package com.example.java_venerdi_s5.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "postazioni")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    private int numeroMassimoPartecipanti;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

}
