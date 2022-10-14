package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.Entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement,Long> {

}
