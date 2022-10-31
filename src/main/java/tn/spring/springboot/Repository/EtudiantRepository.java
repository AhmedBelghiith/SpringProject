package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.Entities.Equipe;
import tn.spring.springboot.Entities.Etudiant;

import java.util.List;

//repository that extends CrudRepository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>
{
    Etudiant findByPrenomE(String prenonE);
    Etudiant findByNomE(String nomE);
}