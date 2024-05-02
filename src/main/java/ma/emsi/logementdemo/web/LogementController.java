package ma.emsi.logementdemo.web;

import ma.emsi.logementdemo.dao.entities.Locataire;
import ma.emsi.logementdemo.dao.entities.Logement;
import ma.emsi.logementdemo.dao.repositories.LocataireRepository;
import ma.emsi.logementdemo.dao.repositories.LogementRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogementController {

    private LocataireRepository locataireRepository;
    private LogementRepository logementRepository;

    public LogementController(LocataireRepository locataireRepository, LogementRepository logementRepository){
        this.locataireRepository = locataireRepository;
        this.logementRepository = logementRepository;

    }

    @GetMapping(path = "/logements")
    public List<Logement> allLogements(){
        return logementRepository.findAll();
    }

    @GetMapping(path = "/logements/{id}")
    public Logement getLogementById(@PathVariable Long id){
        return logementRepository.findById(id).get();
    }

    @GetMapping(path = "/locataires")
    public List<Locataire> allLocataires(){
        return  locataireRepository.findAll();
    }

    @GetMapping(path = "/locataires/{cni}")
    public Locataire getLocataireByCni(@PathVariable String cni){
        return (Locataire) locataireRepository.findByCni(cni);
    }

}
