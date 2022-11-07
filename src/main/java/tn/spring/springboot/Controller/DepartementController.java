package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entities.Departement;
import tn.spring.springboot.Entities.Etudiant;
import tn.spring.springboot.Entities.Option;
import tn.spring.springboot.Service.DepartementService;

import java.util.List;

//mark class as Controller
@RestController
public class DepartementController {
    //autowire the  DepartementService class
    @Autowired
    DepartementService departementService;

    //creating a get mapping that retrieves all the departements detail from the database
    @GetMapping("/departements")
    private List<Departement> getAlldepartements() {
        return departementService.getDepartements();
    }

    //creating a get mapping that retrieves the detail of a specific departement
    @PostMapping("/AddDepartement")
    public Departement addDepartement (@RequestBody Departement departement){
        return departementService.saveDepartement(departement);
    }
    @PostMapping("/AddDepartements")
    public List<Departement> addDepartements (@RequestBody List<Departement> departements){
        return departementService.saveDepartements(departements);
    }
    @PutMapping("/UpdateDepartement")
    public Departement updateDepartement (@RequestBody Departement departement){
        return departementService.upadateDepartement(departement);
    }

    @DeleteMapping("/DeleteDepartement/{idDepart}")
    public String deleteDepartement (@PathVariable Long idDepart){
        return departementService.deleteDepartement(idDepart);
    }



    @GetMapping("/departement/{op}")
    private List<Departement> retrieveDepartementByOptionEtudiant(@PathVariable("op") Option op) {
        return departementService.retrieveDepartementByOptionEtudiant(op);
    }
}
