package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entities.Contrat;
import tn.spring.springboot.Service.ContratService;

import java.util.List;

//mark class as Controller
@RestController
public class ContratController {
    //autowire the ContratService class
    @Autowired
    ContratService contratService;

    //creating a get mapping that retrieves all the contrats detail from the database
    @GetMapping("/contrats")
    private List<Contrat> getAllcontrats() {
        return contratService.getContrats();
    }

    //creating a get mapping that retrieves the detail of a specific contrat
    @GetMapping("/contrat/{idContrat}")
    private Contrat getContrat(@PathVariable("idContrat") long idContrat) {
        return ContratService.getContratById(idContrat);
    }
    @PostMapping("/AddContrat")
    public Contrat addContrat (@RequestBody Contrat contrat){
        return contratService.saveContrat(contrat);
    }
    @PostMapping("/AddContrats")
    public List<Contrat> addContrats (@RequestBody List<Contrat> contrats){
        return contratService.saveContrats(contrats);
    }
    @PutMapping("/UpdateContrat")
    public Contrat updateContrat (@RequestBody Contrat contrat){
        return contratService.upadateContrat(contrat);
    }

    @DeleteMapping("/DeleteContrat/{idContrat}")
    public String deleteContrat (@PathVariable Long idContrat){
        return contratService.deleteContrat(idContrat);
    }



}
