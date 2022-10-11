package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.Entities.Etudiant;

//repository that extends CrudRepository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>
{
}