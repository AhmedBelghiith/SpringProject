package tn.spring.springboot.Entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDetailEquipe")
    private Long IdDetailEquipe;
    private Long salle ;
    private String thematique ;
    @OneToOne (mappedBy = "detailEquipe")
    private Equipe equipe;

    public DetailEquipe(Long salle, String thematique, Equipe equipe) {
        this.salle = salle;
        this.thematique = thematique;
        this.equipe = equipe;
    }

    public DetailEquipe() {

    }

// Constructeur et accesseurs (getters) et mutateurs (setters)
}

