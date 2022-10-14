package tn.spring.springboot.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
@Getter
@Setter
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


// Constructeur et accesseurs (getters) et mutateurs (setters)
}

