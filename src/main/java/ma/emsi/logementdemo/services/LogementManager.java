package ma.emsi.logementdemo.services;

import ma.emsi.logementdemo.dao.entities.Logement;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public interface LogementManager {

    public Logement addLogemnt(Logement logement);
    public Logement updateLogement(Logement logement);
    public Boolean deleteLogement(Logement logement);
    public List<Logement> gelAllLogements();
    
}
