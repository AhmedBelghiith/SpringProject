package tn.spring.springboot.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant ;
    private String prenomE ;
    private String nomE ;
    @Enumerated(EnumType.STRING)
    private Option option;

    @OneToMany(mappedBy = "etudiant")
    private Set<Contrat> contrats;

    @ManyToOne
    private Departement departement;

    @ManyToMany(mappedBy = "etudiants", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;


    public Etudiant(Long idEtudiant, String prenomE, String nomE, Option option, Contrat contrat, Departement departement) {
        this.idEtudiant = idEtudiant;
        this.prenomE = prenomE;
        this.nomE = nomE;
        this.option = option;
        this.departement = departement;
    }

    public Etudiant(Departement departement) {

        this.departement = departement;
    }

    public Etudiant() {

    }

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }


    @Override
    public String toString() {
        return "Etudiant{" +
                "idEtudiant=" + idEtudiant +
                ", prenomE='" + prenomE + '\'' +
                ", nomE='" + nomE + '\'' +
                ", option=" + option +
                '}';
    }
    //onettomany unidirectionnel
}
