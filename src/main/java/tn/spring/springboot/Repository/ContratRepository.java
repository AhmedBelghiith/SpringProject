package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.Entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}