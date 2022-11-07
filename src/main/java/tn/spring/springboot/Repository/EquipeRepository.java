package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import tn.spring.springboot.Entities.Equipe;
import tn.spring.springboot.Entities.Niveau;

import java.util.List;


public interface EquipeRepository extends JpaRepository<Equipe,Long> {
    List<Equipe> findEquipeByEtudiantsIdEtudiant(long IdEtudiant);
    //List<Equipe> findEquipeByEtudiantIdEtudiantAndDetailEquipeThematiqueNotNull(long IdEtudiant);

    List<Equipe> findEquipeByEtudiantsIdEtudiantAndEtudiantsDepartementIdDepart (long idEtudiant , long idDepart);

    @Query("SELECT e FROM Equipe e WHERE e.niveau = :niveau")
    List<Equipe> retriveEquipeByNiveau( Niveau niveau);


    @Modifying
    @Query("DELETE FROM Equipe n WHERE n.niveau = ?1")
    void deleteEquipeByNiveau( Niveau niveau);


}
