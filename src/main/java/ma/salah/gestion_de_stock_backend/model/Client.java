package ma.salah.gestion_de_stock_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "client")
public class Client  extends AbstractEntity{

  @Column(name = "nom")
  private String nom;

  @Column(name = "prenom")
  private String prenom;

  @Embedded
  private Adresse adresse;

  @Column(name = "photo")
  private String photo;

  @Column(name = "mail")
  private String mail;

  @Column(name = "numTel")
  private String numTel;

  @Column(name = "identreprise")
  private Integer idEntreprise;

  @OneToMany(mappedBy = "client")
  private List<CommandeClient> commandeClients;

}
