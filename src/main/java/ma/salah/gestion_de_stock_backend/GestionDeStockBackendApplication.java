package ma.salah.gestion_de_stock_backend;

import ma.salah.gestion_de_stock_backend.model.Adresse;
import ma.salah.gestion_de_stock_backend.model.Entreprise;
import ma.salah.gestion_de_stock_backend.model.Utilisateur;
import ma.salah.gestion_de_stock_backend.repository.UtilisateurRepository;
import ma.salah.gestion_de_stock_backend.user.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class GestionDeStockBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDeStockBackendApplication.class, args);
    }



}
