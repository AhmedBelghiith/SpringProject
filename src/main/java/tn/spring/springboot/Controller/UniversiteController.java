package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entities.Universite;
import tn.spring.springboot.Service.UniversiteService;

import java.util.List;

//mark class as Controller
@RestController
public class UniversiteController {
    //autowire the UniversiteService class
    @Autowired
    UniversiteService universiteService;

    //creating a get mapping that retrieves all the Universites detail from the database
    @GetMapping("/universites")
    private List<Universite> getAlluniversites() {
        return universiteService.getUniversites();
    }

    //creating a get mapping that retrieves the detail of a specific universite
    @GetMapping("/universite/{idUniv}")
    private Universite getUniversite(@PathVariable("idUniv") long idUniv) {
        return universiteService.getUniversiteById(idUniv);
    }
    @PostMapping("/AddUniversite")
    public Universite addUniversite (@RequestBody Universite universite){
        return universiteService.saveUniversite(universite);
    }
    @PostMapping("/AddUniversites")
    public List<Universite> addUniversites (@RequestBody List<Universite> universites){
        return universiteService.saveUniversites(universites);
    }
    @PutMapping("/UpdateUniversite")
    public Universite updateUniversite (@RequestBody Universite universite){
        return universiteService.upadateUniversite(universite);
    }

    @DeleteMapping("/DeleteUniversite/{idUniversite}")
    public String deleteUniversite (@PathVariable Long idUniv){
        return universiteService.deleteUniversite(idUniv);
    }



}
