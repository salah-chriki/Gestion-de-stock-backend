package ma.salah.gestion_de_stock_backend.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.salah.gestion_de_stock_backend.user.Role;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

  private String nom;
  private String prenom;
  private String email;
  private String motDePasse;
  private Role role;
}
