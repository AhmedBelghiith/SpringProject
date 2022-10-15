package tn.spring.springboot.Entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@Entity
@Table( name = "Contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Long idContrat ;
    private Date dateDebutContrat ;
    private Date dateFinContrat ;
    private Boolean archive;
    @Enumerated(EnumType.STRING)
    private Specialite spacialite;

    @ManyToOne
    private Etudiant etudiant;
}
