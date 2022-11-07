package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import tn.spring.springboot.Entities.Etudiant;
import tn.spring.springboot.Entities.Option;


//repository that extends CrudRepository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findByPrenomE(String prenonE);

    Etudiant findByNomE(String nomE);

    @Modifying
    @Query("UPDATE Etudiant e SET e.option = ?1 WHERE e.idEtudiant = ?2")
    void updateEtudiantByOption(Option option , Long idEtudiant);

}