
package ma.emsi.logementdemo.services;

import ma.emsi.logementdemo.dao.entities.Logement;
import ma.emsi.logementdemo.dao.repositories.LogementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogementService implements LogementManager{

    @Autowired
    private LogementRepository logementRepository;


    @Override
    public Logement addLogemnt(Logement logement) {
        return logementRepository.save(logement);
    }

    @Override
    public Logement updateLogement(Logement logement) {
        return logementRepository.save(logement);
    }

    @Override
    public Boolean deleteLogement(Logement logement) {
        try {
            logementRepository.delete(logement);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }

    @Override
    public List<Logement> gelAllLogements() {
        return logementRepository.findAll();
    }
}
