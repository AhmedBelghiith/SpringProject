package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.Entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}
