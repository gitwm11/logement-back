package ma.emsi.logementdemo.services;


import ma.emsi.logementdemo.dao.entities.Locataire;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LocataireManager {
    public Locataire addLocataire(Locataire locataire);
    public Locataire updateLocataire(Locataire locataire);
    public boolean deleteLocataire(Locataire locataire);
    public List<Locataire> getAllLocataires();
}
