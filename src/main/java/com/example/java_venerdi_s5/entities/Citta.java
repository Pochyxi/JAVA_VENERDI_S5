package manuelsenatore.ProjectW4.entities;

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
public class Citta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "citta")
    @ToString.Exclude
    private List<Edificio> edifici;
    private String name;

    public Citta(String name) {
        this.name = name;
    }
}
