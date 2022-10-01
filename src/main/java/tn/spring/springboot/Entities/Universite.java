package tn.spring.springboot.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private Long idUniv ;
    private String nomUniv ;

    @OneToMany(mappedBy = "universite")
    private List<Departement> departements;

    public Universite(String nomUniv, List<Departement> departements) {
        this.nomUniv = nomUniv;
        this.departements = departements;
    }

    public Universite() {

    }

// Constructeur et accesseurs (getters) et mutateurs (setters)
}

