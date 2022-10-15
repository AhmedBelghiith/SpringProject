package tn.spring.springboot.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.Entities.Contrat;
import java.util.List;


public interface ContratRepository extends JpaRepository<Contrat, Long> {
    List<Contrat> findAll();
}