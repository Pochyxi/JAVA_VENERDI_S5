package manuelsenatore.ProjectW4.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate data;

    @OneToOne
    private Postazione postazione;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
