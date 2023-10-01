package ma.salah.gestion_de_stock_backend.repository;

import ma.salah.gestion_de_stock_backend.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

//  // JPQL query
//  @Query(value = "select u from Utilisateur u where u.email = :email")
//  Optional<Utilisateur> findUtilisateurByEmail(@Param("email") String email);

  Optional<Utilisateur> findByEmail(String email);
}
