package ma.emsi.logementdemo.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString @Builder
public class Logement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer surface;
    private String description;
    private LogementType type;
    private LogementStatus status;
    private double prix;
    private LocalDate date_location;
    private String photo;

    @ManyToOne
    private Locataire locataire;
}
