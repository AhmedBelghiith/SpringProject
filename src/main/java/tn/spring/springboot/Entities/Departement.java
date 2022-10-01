package tn.spring.springboot.Entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name = "Departement")
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Long idDepart ;
    private String nomDepart ;

    @OneToMany(mappedBy = "departement")
    private List<Etudiant> etudiants;

    @ManyToOne
    private Universite universite;



    public Departement(String nomDepart, List<Etudiant> etudiant) {
        this.nomDepart = nomDepart;
        this.etudiants = etudiants;
    }

    public Departement() {

    }
}
