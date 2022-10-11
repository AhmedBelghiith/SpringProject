package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.springboot.Entities.Etudiant;
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
    private List<Etudiant> retrieveAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    //creating a get mapping that retrieves the detail of a specific etudiant
    @GetMapping("/etudiant/{idEtudiant}")
    private Etudiant retrieveEtudiant(@PathVariable("idEtudiant") long idEtudiant) {
        return etudiantService.getEtudiantById(idEtudiant);
    }


}
