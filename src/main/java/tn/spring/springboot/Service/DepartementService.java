package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entities.Departement;
import tn.spring.springboot.Repository.DepartementRepository;

import java.util.List;

//defining the business logic
@Service
public class DepartementService {
    @Autowired
    static
    DepartementRepository departementRepository;

    //getting all departements record by using the method findaAll() of CrudRepository
    public List<Departement> getDepartements(){
        return departementRepository.findAll();
    }
    //getting a specific record by using the method findById() of CrudRepository
    public static Departement getDepartementById(long idDepartement) {
        return departementRepository.findById(idDepartement).get();
    }
    public Departement saveDepartement(Departement departement){
        return departementRepository.save(departement);
    }
    public List<Departement> saveDepartements(List<Departement> departements){
        return departementRepository.saveAll(departements);
    }

    public String deleteDepartement(Long idDepartement){
        departementRepository.deleteById(idDepartement);
        return "Departement supprimé !" +idDepartement;
    }
    public Departement upadateDepartement(Departement departement){
        Departement existingDepartement = departementRepository.findById(departement.getIdDepart()).orElse(null);
        existingDepartement.setNomDepart(departement.getNomDepart());
        existingDepartement.setEtudiants(departement.getEtudiants());

        return departementRepository.save(existingDepartement);
    }


}