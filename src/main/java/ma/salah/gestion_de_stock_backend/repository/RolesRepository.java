package ma.salah.gestion_de_stock_backend.repository;

import ma.salah.gestion_de_stock_backend.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

    Optional<Roles> findByRoleName(String roleName);
}
