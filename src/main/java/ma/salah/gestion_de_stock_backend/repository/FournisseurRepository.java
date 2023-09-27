package ma.salah.gestion_de_stock_backend.repository;

import ma.salah.gestion_de_stock_backend.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

}
