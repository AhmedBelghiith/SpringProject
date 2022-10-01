package tn.spring.springboot.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe", nullable = false)
    private Long idEquipe ;
    private String nomEquipe ;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @ManyToMany
    @JoinTable( name = "T_Etudiants_Equipes_Associations",
            joinColumns = @JoinColumn( name = "idEquipe" ),
            inverseJoinColumns = @JoinColumn( name = "idEtudiant" ) )
    private List<Etudiant> users = new ArrayList<>();

    public Equipe() {
    }

    public Equipe(Long idEquipe, String nomEquipe, Niveau niveau, List<Etudiant> users) {
        this.idEquipe = idEquipe;
        this.nomEquipe = nomEquipe;
        this.niveau = niveau;
        this.users = users;
    }

    public Long getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public List<Etudiant> getUsers() {
        return users;
    }

    public void setUsers(List<Etudiant> users) {
        this.users = users;
    }
}
