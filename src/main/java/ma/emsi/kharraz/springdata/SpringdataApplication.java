package ma.emsi.kharraz.springdata;

import ma.emsi.kharraz.springdata.model.Etudiant;
import ma.emsi.kharraz.springdata.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ma.emsi.kharraz.springdata.enums.Genre;
@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringdataApplication.class, args);
    }
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public void run(String... args) throws Exception {
        Etudiant et1=Etudiant.builder()
                .nom("Adnani")
                .prenom("Morad")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et1);
        Etudiant et2=Etudiant.builder()
                .nom("Kharraz")
                .prenom("Kenza")
                .genre(Genre.Femme)
                .build();
        etudiantRepository.save(et2);
        Etudiant et3=Etudiant.builder()
                .nom("Moughit")
                .prenom("Aya")
                .genre(Genre.Femme)
                .build();
        etudiantRepository.save(et3);

    }
}
