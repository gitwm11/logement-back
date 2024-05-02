package ma.emsi.logementdemo.dao.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString @Builder
public class Locataire {
    @Id
    private String id;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String cni ;
    private Integer age;
    private String telephone;
}
