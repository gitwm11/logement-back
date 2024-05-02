package ma.emsi.logementdemo.dao.repositories;

import ma.emsi.logementdemo.dao.entities.Logement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogementRepository extends JpaRepository<Logement,Long> {
}
