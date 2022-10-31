package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.Entities.Equipe;

import java.util.List;


public interface EquipeRepository extends JpaRepository<Equipe,Long> {
    List<Equipe> findEquipeByEtudiantsIdEtudiant(long IdEtudiant);
    List<Equipe> findEquipeByEtudiantsIdEtudiantAndDetailEquipeThematiqueNotNull(long IdEtudiant);


    //List<Equipe> findEquipeByEtudiantsIdEtudiantAndEtudiantDepartementIdDepart (long idEtudiant, long idDepart);
}
