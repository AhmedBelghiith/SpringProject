package tn.spring.springboot.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDetailEquipe")
    private Long IdDetailEquipe;
    private Long salle ;
    private String thematique ;
    @OneToOne (mappedBy = "detailEquipe")
    private Equipe equipe;

}

