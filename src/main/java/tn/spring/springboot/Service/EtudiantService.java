package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entities.Etudiant;
import tn.spring.springboot.Repository.EtudiantRepository;

import java.util.ArrayList;
import java.util.List;

//defining the business logic
@Service
public class EtudiantService
{
    @Autowired
    EtudiantRepository etudiantRepository;
    //getting all etudiants record by using the method findaAll() of CrudRepository
    public List<Etudiant> retrieveAllEtudiants()
    {
        List<Etudiant> etudiants = new ArrayList<Etudiant>();
        etudiantRepository.findAll();
        return etudiants;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public Etudiant getEtudiantById(long id)
    {
        return etudiantRepository.findById(id).get();
    }

}