package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entities.DetailEquipe;
import tn.spring.springboot.Repository.DetailEquipeRepository;

import java.util.List;

//defining the business logic
@Service
public class DetailEquipeService {
    @Autowired
    DetailEquipeRepository detailEquipeRepository;

    //getting all detailEquipes record by using the method findaAll() of CrudRepository
    public List<DetailEquipe> getDetailEquipes(){
        return detailEquipeRepository.findAll();
    }
    //getting a specific record by using the method findById() of CrudRepository
    public DetailEquipe saveDetailEquipe(DetailEquipe detailEquipe){
        return detailEquipeRepository.save(detailEquipe);
    }
    public List<DetailEquipe> saveDetailEquipes(List<DetailEquipe> detailEquipe){
        return detailEquipeRepository.saveAll(detailEquipe);
    }

    public String deleteDetailEquipe(Long idDetailEquipe){
        detailEquipeRepository.deleteById(idDetailEquipe);
        return "DetailEquipe supprimé !" +idDetailEquipe;
    }
    public DetailEquipe upadateDetailEquipe(DetailEquipe detailEquipe){
        DetailEquipe existingDetailEquipe = detailEquipeRepository.findById(detailEquipe.getIdDetailEquipe()).orElse(null);
        existingDetailEquipe.setSalle(detailEquipe.getSalle());
        existingDetailEquipe.setThematique(detailEquipe.getThematique());
        existingDetailEquipe.setEquipe(detailEquipe.getEquipe());
        return detailEquipeRepository.save(existingDetailEquipe);
    }


    public List<DetailEquipe> findByThematiqueLike(String thematique){
        return detailEquipeRepository.findByThematiqueLike(thematique);
    }


}