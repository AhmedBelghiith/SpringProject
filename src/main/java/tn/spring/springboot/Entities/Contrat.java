package tn.spring.springboot.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
    @JsonIgnore
    private Etudiant etudiant;
}
