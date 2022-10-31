package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entities.DetailEquipe;
import tn.spring.springboot.Entities.Equipe;
import tn.spring.springboot.Repository.DetailEquipeRepository;
import tn.spring.springboot.Repository.EquipeRepository;

import java.util.List;

//defining the business logic
@Service
public class EquipeService {
    @Autowired
    EquipeRepository equipeRepository;
    private DetailEquipeRepository detailEquipeRepository;
    private DetailEquipe detailEquipe;

    //getting all Equipes record by using the method findaAll() of CrudRepository
    public List<Equipe> getEquipes(){
        return equipeRepository.findAll();
    }
    //getting a specific record by using the method findById() of CrudRepository
    public Equipe saveEquipe(Equipe equipe){
        return equipeRepository.save(equipe);
    }
    public List<Equipe> saveEquipes(List<Equipe> equipes){
        return equipeRepository.saveAll(equipes);
    }

    public String deleteEquipe(Long idEquipe){
        equipeRepository.deleteById(idEquipe);
        return "Equipe supprimé !" +idEquipe;
    }
    public Equipe upadateEquipe(Equipe equipe){
        Equipe existingEquipe = equipeRepository.findById(equipe.getIdEquipe()).orElse(null);
        existingEquipe.setNomEquipe(equipe.getNomEquipe());
        existingEquipe.setNiveau(equipe.getNiveau());
        existingEquipe.setDetailEquipe(equipe.getDetailEquipe());
        existingEquipe.setEtudiants(equipe.getEtudiants());

        return equipeRepository.save(existingEquipe);
    }


    public List<Equipe> findEquipeByEtudiantsIdEtudiant(long IdEtudiant){

        return equipeRepository.findEquipeByEtudiantsIdEtudiant(IdEtudiant);
    }
    public List<Equipe> findEquipeByEtudiantsIdEtudiantAndDetailEquipeThematiqueNotNull(long IdEtudiant) {
        if ((this.detailEquipeRepository.findByThematiqueLike(detailEquipe.getThematique())) != null) {

            return equipeRepository.findEquipeByEtudiantsIdEtudiantAndDetailEquipeThematiqueNotNull(IdEtudiant);
        } else return null;
    }

    /*public List<Equipe> findEquipeByEtudiantsIdEtudiantAndEtudiantDepartementIdDepart (long idEtudiant, long idDepart){
        return equipeRepository.findEquipeByEtudiantsIdEtudiantAndEtudiantDepartementIdDepart(idEtudiant,idDepart);
    }*/



}