package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entities.Equipe;
import tn.spring.springboot.Entities.Etudiant;
import tn.spring.springboot.Service.EquipeService;


import java.util.List;

//mark class as Controller
@RestController
public class EquipeController {
    //autowire the  EquipeService class
    @Autowired
    EquipeService equipeService;

    //creating a get mapping that retrieves all the Equipes detail from the database
    @GetMapping("/equipes")
    private List<Equipe> getAllequipes() {
        return equipeService.getEquipes();
    }


    //creating a get mapping that retrieves the detail of a specific Equipe
    @PostMapping("/AddEquipe")
    public Equipe addEquipe (@RequestBody Equipe equipe){
        return equipeService.saveEquipe(equipe);
    }
    @PostMapping("/AddEquipes")
    public List<Equipe> addEquipes (@RequestBody List<Equipe> equipes){
        return equipeService.saveEquipes(equipes);
    }
    @PutMapping("/UpdateEquipe")
    public Equipe updateEquipe (@RequestBody Equipe equipe){
        return equipeService.upadateEquipe(equipe);
    }

    @DeleteMapping("/DeleteEquipe/{idEquipe}")
    public String deleteEquipe (@PathVariable Long idEquipe){
        return equipeService.deleteEquipe(idEquipe);
    }

    @GetMapping("/findEquipeByEtudiant/{idEtudiant}")
    public List<Equipe> findByEtudiant(@PathVariable("idEtudiant") Long idEtudiant){

        return  equipeService.findEquipeByEtudiantsIdEtudiant(idEtudiant);
    }
    @GetMapping("/findEquipeByEtudiantsIdEtudiantAndDetailEquipeThematiqueNotNull/{idEtudiant}")
    public List<Equipe> findByEtudiantAndThematiquenotnull(@PathVariable("idEtudiant") Long idEtudiant){

        return  equipeService.findEquipeByEtudiantsIdEtudiantAndDetailEquipeThematiqueNotNull(idEtudiant);
    }

   /* @GetMapping("/findEquipeByEtudiantsIdEtudiantAndEtudiantDepartementIdDepart/{idEtudiant, idDepartement")
    public List<Equipe> findByEtudiantIdEtudiantAndEtudiantDepartementIdDepart(@PathVariable("idEtudiant") Long idEtudiant,@PathVariable("idDepart") Long idDepart){

        return  equipeService.findEquipeByEtudiantsIdEtudiantAndEtudiantDepartementIdDepart(idEtudiant,idDepart);
    }*/
}
