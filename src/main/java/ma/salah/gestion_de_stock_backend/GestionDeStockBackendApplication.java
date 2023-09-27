package ma.salah.gestion_de_stock_backend;

import ma.salah.gestion_de_stock_backend.model.Adresse;
import ma.salah.gestion_de_stock_backend.model.Entreprise;
import ma.salah.gestion_de_stock_backend.model.Roles;
import ma.salah.gestion_de_stock_backend.model.Utilisateur;
import ma.salah.gestion_de_stock_backend.repository.RolesRepository;
import ma.salah.gestion_de_stock_backend.repository.UtilisateurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GestionDeStockBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDeStockBackendApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(UtilisateurRepository utilisateurRepository, PasswordEncoder passwordEncoder, RolesRepository rolesRepository){
        return args -> {
            Roles role=new Roles("USER");
            rolesRepository.save(role);
            List<Roles> roles=new ArrayList<>();
            roles.add(role);
            Adresse adresse=new Adresse("dsds","dsds","tetouan","daads","morrocco");
            Entreprise entreprise=new Entreprise();
//            Instant date=Instant.parse("1996-18-01");
            Utilisateur utilisateur= new Utilisateur("salah","salahchriki1@gmail.com",passwordEncoder.encode("password"),adresse,"dffdfs",roles);
            utilisateurRepository.save(utilisateur);
        };
    }

}
