package ma.emsi.logementdemo.dao.repositories;

import ma.emsi.logementdemo.dao.entities.Locataire;
import ma.emsi.logementdemo.dao.entities.Logement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocataireRepository extends JpaRepository<Locataire,String> {
    void save(Logement logement);
    List<Locataire> findByCni(String cni);
}
