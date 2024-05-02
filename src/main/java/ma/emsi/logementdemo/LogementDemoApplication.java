package ma.emsi.logementdemo;

import ma.emsi.logementdemo.dao.entities.Locataire;
import ma.emsi.logementdemo.dao.entities.Logement;
import ma.emsi.logementdemo.dao.entities.LogementStatus;
import ma.emsi.logementdemo.dao.entities.LogementType;
import ma.emsi.logementdemo.dao.repositories.LocataireRepository;
import ma.emsi.logementdemo.dao.repositories.LogementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class LogementDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogementDemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(LocataireRepository locataireRepository, LogementRepository logementRepository){
        return args -> {

            locataireRepository.save(Locataire.builder().id(UUID.randomUUID().toString())
                    .nom("said").prenom("laisi").cni("KN234543").age(32).telephone("0343223344")
                    .build());
            locataireRepository.save(Locataire.builder().id(UUID.randomUUID().toString())
                    .nom("laila").prenom("rami").cni("EN234543").age(34).telephone("0343298344")
                    .build());
            locataireRepository.save(Locataire.builder().id(UUID.randomUUID().toString())
                    .nom("khaled").prenom("jalal").cni("KN234043").age(33).telephone("0743223344")
                    .build());
            locataireRepository.save(Locataire.builder().id(UUID.randomUUID().toString())
                    .nom("meryam").prenom("ouali").cni("KS233243").age(35).telephone("0643223344")
                    .build());
            locataireRepository.save(Locataire.builder().id(UUID.randomUUID().toString())
                    .nom("karim").prenom("jounid").cni("RN114543").age(31).telephone("0443223344")
                    .build());


            LogementType[] logementTypes = LogementType.values();
            Random random = new Random();

            locataireRepository.findAll().forEach(lt->{
                for (int i=0; i<10;i++){
                    int index = random.nextInt(logementTypes.length);
                    Logement logement = Logement.builder()
                            .prix(2000+(int)(Math.random()*10000))
                            .type(logementTypes[index])
                            .status(LogementStatus.DISPONIBLE)
                            .date_location(LocalDate.now())
                            .locataire(lt)
                            .build();
                    locataireRepository.save(logement);
                }
            });

        };
    }

}
