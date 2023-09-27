package ma.salah.gestion_de_stock_backend.repository;

import ma.salah.gestion_de_stock_backend.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

}
