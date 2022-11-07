package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.Entities.Departement;

import org.springframework.data.jpa.repository.Query;
import tn.spring.springboot.Entities.Option;

import java.util.List;


public interface DepartementRepository extends JpaRepository<Departement,Long> {
    @Query( value = "select * from Departement p " +
            "join departement_etudiants b " +
            "   on p.id = b.idDepart " +
            "join Etudiant c " +
            "   on c.id = b.idEtudiant " +
            "where c.option = :option", nativeQuery = true)
    List<Departement> retrieveDepartementByOptionEtudiant(Option op);


}
