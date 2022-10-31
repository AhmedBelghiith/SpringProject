package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.Entities.DetailEquipe;

import java.util.List;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Long> {
    List<DetailEquipe> findByThematiqueLike(String thematique);

}
