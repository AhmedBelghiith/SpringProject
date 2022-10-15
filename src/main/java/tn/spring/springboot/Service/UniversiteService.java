package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entities.Universite;
import tn.spring.springboot.Repository.UniversiteRepository;


import java.util.List;

//defining the business logic
@Service
public class UniversiteService {
    @Autowired
    UniversiteRepository universiteRepository;

    //getting all Universites record by using the method findaAll() of CrudRepository
    public List<Universite> getUniversites(){
        return universiteRepository.findAll();
    }
    //getting a specific record by using the method findById() of CrudRepository
    public Universite saveUniversite(Universite universite){
        return universiteRepository.save(universite);
    }
    public List<Universite> saveUniversites(List<Universite> universites){
        return universiteRepository.saveAll(universites);
    }

    public String deleteUniversite(Long idUniversite){
        universiteRepository.deleteById(idUniversite);
        return "Universite supprimé !" +idUniversite;
    }
    public Universite upadateUniversite(Universite universite){
        Universite existingUniversite = universiteRepository.findById(universite.getIdUniv()).orElse(null);
        existingUniversite.setNomUniv(universite.getNomUniv());
        existingUniversite.setDepartements(universite.getDepartements());
        return universiteRepository.save(existingUniversite);
    }


}