package ma.salah.gestion_de_stock_backend.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  Integer id;

  @Column(name = "code")
  private String code;

  @Column(name = "designation")
  private String designation;

  @Column(name = "identreprise")
  private Integer idEntreprise;

  @OneToMany(mappedBy = "category")
  private List<Article> articles;

}
