package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entities.Equipe;
import tn.spring.springboot.Entities.Etudiant;
import tn.spring.springboot.Repository.EtudiantRepository;

import java.util.List;

//defining the business logic
@Service
public class EtudiantService
{
    @Autowired
    EtudiantRepository etudiantRepository;
    //getting all etudiants record by using the method findaAll() of CrudRepository
    public List<Etudiant> getEtudiants(){
        return etudiantRepository.findAll();
    }

    //getting a specific record by using the method findById() of CrudRepository
    public Etudiant getEtudiantById(long id)
    {
        return etudiantRepository.findById(id).get();
    }

    public Etudiant getEtudiantByPnemoE(String prenomE){return etudiantRepository.findByPrenomE(prenomE);}
    public Etudiant getEtudiantByNomE(String nomE){return etudiantRepository.findByNomE(nomE);}


    public Etudiant saveEtudiant(Etudiant etudiant){
        return etudiantRepository.save(etudiant);
    }
    public List<Etudiant> saveEtudiants(List<Etudiant> etudiants){
        return etudiantRepository.saveAll(etudiants);
    }

    public String deleteEtudiant(Long idEtudiant){
        etudiantRepository.deleteById(idEtudiant);
        return "Etudiant supprimé !" +idEtudiant;
    }
    public Etudiant upadateEtudiant(Etudiant etudiant){
        Etudiant existingEtudiant = etudiantRepository.findById(etudiant.getIdEtudiant()).orElse(null);
        existingEtudiant.setPrenomE(etudiant.getPrenomE());
        existingEtudiant.setNomE(etudiant.getNomE());
        existingEtudiant.setOption(etudiant.getOption());
        return etudiantRepository.save(existingEtudiant);
    }


}