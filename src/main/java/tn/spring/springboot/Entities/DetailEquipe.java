package tn.spring.springboot.Entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="salle")
    private Long salle ;
    private String thematique ;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}

