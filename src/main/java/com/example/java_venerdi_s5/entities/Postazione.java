package manuelsenatore.ProjectW4.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String description;
    private Tipo tipo;
    private int maxSize;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

}
