package com.example.java_venerdi_s5;

import com.example.java_venerdi_s5.entities.*;
import com.example.java_venerdi_s5.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class JavaVenerdiS5Application implements CommandLineRunner {
    @Autowired
    UtenteService utenteService;

    @Autowired
    CittaService cittaService;

    @Autowired
    PostazioneService postazioneService;

    @Autowired
    EdificioService edificioService;

    @Autowired
    PrenotazioneService prenotazioneService;

    public static void main( String[] args ) {
        SpringApplication.run( JavaVenerdiS5Application.class, args );
    }

    @Override
    public void run( String... args ) throws Exception {

        //AGGIUNTA UTENTE
//        utenteService.addUtente(
//                Utente.builder()
//                        .username( "budkaSplit" )
//                        .nomeCompleto( "Adiener Lopez Velazque" )
//                        .email( "adienerlopez@Gmail.com" )
//                        .build() );

        //LISTA TUTTI UTENTI
//        System.out.println(utenteService.getAll());

//        AGGIUNTA CITTA
//        cittaService.addCitta(
//                Citta.builder()
//                        .nome( "Napoli" )
//                        .build()
//        );

        //LISTA DI TUTTE CITTA
//        System.out.println(cittaService.getAll());
//        System.out.println(cittaService.getCittaById( 1L ));

        // AGGIUNTA DI UN EDIFICIO
//        edificioService.addEdificio(
//                Edificio.builder()
//                        .nome( "Budka palace" )
//                        .citta( cittaService.getCittaById(1L) )
//                        .indirizzo( "Via cani volanti" )
//                        .build()
//        );

        //LISTA DI UN TUTTI GLI EDIFICI
//        System.out.println(edificioService.getAll());



        //AGGIUNTA POSTAZIONE
//        postazioneService.addPostazione(
//                Postazione.builder()
//                        .descrizione( "Ampio spazio" )
//                        .edificio( edificioService.findEdificioById( 1L ) )
//                        .tipo( Tipo.OPENSPACE )
//                        .numeroMassimoPartecipanti( 57 )
//                        .build()
//        );

        //LISTA DI UN TUTTE LE POSTAZIONI
//        System.out.println(postazioneService.getAll());

        // RICERCA POSTAZIONI PER TIPOLOGIA E CITTA'
//        System.out.println("______________");
//        System.out.println(postazioneService.findPostazioneByTipoAndCitta( Tipo.OPENSPACE,
//                cittaService.getCittaById( 1L ) ));
//        System.out.println("______________");

        // CONTROLLO SULL'ARRAY DI RITORNO DA INSERIRE NELLA CREAZIONE DI UNA NUOVA PRENOTAZIONE
        // SE L'ARRAY E' MAGGIORE DI 0 ALLORA LA PRENOTAZIONE FALLISCE
//        System.out.println(prenotazioneService.controllaValiditaPrenotazione(
//                utenteService.getAll().get( 0 ),
//                LocalDate.now(),
//                postazioneService.getAll().get(0)
//        ));

        // CREAZIONE DI UNA PRENOTAZIONE
//        addPrenotazioneConControllo(
//                utenteService.getAll().get(0),
//                postazioneService.getAll().get(0),
//                LocalDate.of( 2022, 10, 28 )
//        );

    }

    public void addPrenotazioneConControllo(Utente utente, Postazione postazione, LocalDate dataPrenotazione ) {
        if (prenotazioneService.controllaValiditaPrenotazione(
                utenteService.getUtenteById( utente.getId() ),
                dataPrenotazione,
                postazioneService.getPostazioneById( postazione.getId() )
        ).size() > 0) {
            System.out.println("non fare il furbo, superato limite massimo giornaliero di prenotazioni.");
        }else {
            System.out.println("Prenotazione salvata con successo vvvvvvvvvvvvv");
            prenotazioneService.addPrenotazione(
                    Prenotazione.builder()
                            .utente( utente )
                            .postazione( postazione )
                            .data( dataPrenotazione )
                            .build()
            );
        }
    }
}
