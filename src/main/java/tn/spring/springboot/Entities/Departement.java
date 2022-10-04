package tn.spring.springboot.Entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Departement")
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Long idDepart ;
    private String nomDepart ;

    @OneToMany(mappedBy = "departement")
    private Set<Etudiant> etudiants;

    public Departement(String nomDepart, Set<Etudiant> etudiants) {
        this.nomDepart = nomDepart;
        this.etudiants = etudiants;
    }

    public Departement() {

    }
}
