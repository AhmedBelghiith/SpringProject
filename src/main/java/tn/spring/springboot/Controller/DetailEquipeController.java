package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entities.DetailEquipe;
import tn.spring.springboot.Service.DetailEquipeService;


import java.util.List;

//mark class as Controller
@RestController
public class DetailEquipeController {
    //autowire the  DetailEquipeService class
    @Autowired
    DetailEquipeService detailEquipeService;

    //creating a get mapping that retrieves all the detailEquipes detail from the database
    @GetMapping("/detailEquipes")
    private List<DetailEquipe> getAlldetailEquipes() {
        return detailEquipeService.getDetailEquipes();
    }

    //creating a get mapping that retrieves the detail of a specific detailEquipe
    @PostMapping("/AddDetailEquipe")
    public DetailEquipe addDetailEquipe (@RequestBody DetailEquipe detailEquipe){
        return detailEquipeService.saveDetailEquipe(detailEquipe);
    }
    @PostMapping("/AddDetailEquipes")
    public List<DetailEquipe> addDetailEquipes (@RequestBody List<DetailEquipe> detailEquipes){
        return detailEquipeService.saveDetailEquipes(detailEquipes);
    }
    @PutMapping("/UpdateDetailEquipe")
    public DetailEquipe updateDetailEquipe (@RequestBody DetailEquipe detailEquipe){
        return detailEquipeService.upadateDetailEquipe(detailEquipe);
    }

    @DeleteMapping("/DeleteDetailEquipe/{idDetailEquipe}")
    public String deleteDetailEquipe (@PathVariable Long idDetailEquipe){
        return detailEquipeService.deleteDetailEquipe(idDetailEquipe);
    }


    @GetMapping("/findByThematique/{thematique}")
    public List<DetailEquipe> findByThematique(@PathVariable(required = false,name = "thematique") String thematique){
        return detailEquipeService.findByThematiqueLike(thematique);
    }

}
