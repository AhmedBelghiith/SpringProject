package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entities.Equipe;
import tn.spring.springboot.Entities.Etudiant;
import tn.spring.springboot.Entities.Option;
import tn.spring.springboot.Service.EtudiantService;

import java.util.List;

//mark class as Controller
@RestController
public class EtudiantController {
    //autowire the EtudiantService class
    @Autowired
    EtudiantService etudiantService;
    @GetMapping
    private String sayHi(){
        return "hello";
    }

    //creating a get mapping that retrieves all the etudiants detail from the database
    @GetMapping("/etudiants")
    private List<Etudiant> getAlletudiants() {
        return etudiantService.getEtudiants();
    }

    //creating a get mapping that retrieves the detail of a specific etudiant
    @GetMapping("/etudiant/{idEtudiant}")
    private Etudiant getEtudiant(@PathVariable("idEtudiant") long idEtudiant) {
        return etudiantService.getEtudiantById(idEtudiant);
    }

    @GetMapping("/EtudiantByPrenomE/{prenomE}")
    public Etudiant getEtudiantByPrenomE(@PathVariable String prenomE){
        return etudiantService.getEtudiantByPnemoE(prenomE);
    }

    @GetMapping("/EtudiantByNomE/{nomE}")
    public Etudiant getEtudiantByNomE(@PathVariable String nomE){
        return etudiantService.getEtudiantByNomE(nomE);
    }
    @PostMapping("/AddEtudiant")
    public Etudiant addEtudiant (@RequestBody Etudiant etudiant){
        return etudiantService.saveEtudiant(etudiant);
    }
    @PostMapping("/AddEtudiants")
    public List<Etudiant> addEtudiants (@RequestBody List<Etudiant> users){
        return etudiantService.saveEtudiants(users);
    }
    @PutMapping("/UpdateEtudiant")
    public Etudiant updateEtudiant (@RequestBody Etudiant etudiant){
        return etudiantService.upadateEtudiant(etudiant);
    }

    @DeleteMapping("/DeleteEtudiant/{idEtudiant}")
    public String deleteEtudiant (@PathVariable Long idEtudiant){
        return etudiantService.deleteEtudiant(idEtudiant);
    }


    @PutMapping("/updateEtudiantByOption/{option}/{idEtudiant}")
    public Etudiant updateEtudiantByOption(@PathVariable Option option,@PathVariable Long idEtudiant){
        return etudiantService.updateEtudiantByOption(option, idEtudiant);
    }

}
