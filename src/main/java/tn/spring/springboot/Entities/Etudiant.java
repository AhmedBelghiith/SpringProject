package tn.spring.springboot.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

    @OneToOne(mappedBy = "etudiant")
    private Contrat contrat;

    @ManyToOne
    private Departement departement;

    @ManyToMany
    @JoinTable( name = "T_Etudiants_Equipes_Associations",
            joinColumns = @JoinColumn( name = "idEtudiant" ),
            inverseJoinColumns = @JoinColumn( name = "idEquipe" ) )
    private List<Equipe> equipes = new ArrayList<>();

    public Etudiant(Long idEtudiant, String prenomE, String nomE, Option option, Contrat contrat) {
        this.idEtudiant = idEtudiant;
        this.prenomE = prenomE;
        this.nomE = nomE;
        this.option = option;
        this.contrat = contrat;
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

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "idEtudiant=" + idEtudiant +
                ", prenomE='" + prenomE + '\'' +
                ", nomE='" + nomE + '\'' +
                ", option=" + option +
                ", contrat=" + contrat +
                '}';
    }
}
