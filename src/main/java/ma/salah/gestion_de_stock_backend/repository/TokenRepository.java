package ma.salah.gestion_de_stock_backend.repository;

import java.util.List;
import java.util.Optional;

import ma.salah.gestion_de_stock_backend.model.auth.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TokenRepository extends JpaRepository<Token, Integer> {

  @Query(value = """
          select t from Token t inner join Utilisateur u\s
          on t.utilisateur.id = u.id\s
          where u.id = :id and (t.expired = false or t.revoked = false)\s
          """)
  List<Token> findAllValidTokenByUser(Integer id);

  Optional<Token> findByToken(String token);
}
