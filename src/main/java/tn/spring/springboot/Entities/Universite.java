package tn.spring.springboot.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table( name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private Long idUniv ;
    private String nomUniv ;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements;
    public Universite(String nomUniv, Set<Departement> departements1) {
        this.nomUniv = nomUniv;
        this.departements = departements1;
    }

    public Universite(Set<Departement> departements) {

        this.departements = departements;
    }

    public Universite() {

    }

// Constructeur et accesseurs (getters) et mutateurs (setters)
}

