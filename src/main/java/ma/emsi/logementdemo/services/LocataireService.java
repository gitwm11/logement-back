package ma.emsi.logementdemo.services;

import ma.emsi.logementdemo.dao.entities.Locataire;
import ma.emsi.logementdemo.dao.repositories.LocataireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LocataireService implements LocataireManager{
    @Autowired
    private LocataireRepository locataireRepository;

    @Override
    public Locataire addLocataire(Locataire locataire) {
        return locataireRepository.save(locataire);
    }

    @Override
    public Locataire updateLocataire(Locataire locataire) {
        try {
            return locataireRepository.save(locataire)
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public boolean deleteLocataire(Locataire locataire) {
        try {
            locataireRepository.delete(locataire);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }

    @Override
    public List<Locataire> getAllLocataires() {
        return locataireRepository.findAll();
    }
}
