package tn.spring.springboot.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.spring.springboot.Entities.Etudiant;

//repository that extends CrudRepository
public interface EtudiantRepository extends CrudRepository<Etudiant,Long>
{
}