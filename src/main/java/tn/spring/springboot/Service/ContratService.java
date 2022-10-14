package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entities.Contrat;
import tn.spring.springboot.Repository.ContratRepository;

import java.util.List;

//defining the business logic
@Service
public class ContratService
{
    @Autowired
    static
    ContratRepository contratRepository;

    //getting all contrats record by using the method findaAll() of CrudRepository
    public List<Contrat> getContrats(){
        return contratRepository.findAll();
    }
    //getting a specific record by using the method findById() of CrudRepository
    public static Contrat getContratById(long idContrat) {
        return contratRepository.findById(idContrat).get();
    }
    public Contrat saveContrat(Contrat contrat){
        return contratRepository.save(contrat);
    }
    public List<Contrat> saveContrats(List<Contrat> contrats){
        return contratRepository.saveAll(contrats);
    }

    public String deleteContrat(Long idContrat){
        contratRepository.deleteById(idContrat);
        return "Contrat supprimé !" +idContrat;
    }
    public Contrat upadateContrat(Contrat contrat){
        Contrat existingContrat = contratRepository.findById(contrat.getIdContrat()).orElse(null);
        existingContrat.setDateDebutContrat(contrat.getDateDebutContrat());
        existingContrat.setDateFinContrat(contrat.getDateFinContrat());
        existingContrat.setArchive(contrat.getArchive());
        existingContrat.setSpacialite(contrat.getSpacialite());

        return contratRepository.save(existingContrat);
    }


}