package ma.salah.gestion_de_stock_backend.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @SequenceGenerator(name = "abstract_seq", allocationSize = 1)
  private Integer id;

//  @CreatedDate
//  @Column(name = "creationDate", updatable = false)
//  private Instant creationDate;

  @LastModifiedDate
  @Column(name = "lastModifiedDate")
  private Instant lastModifiedDate;


}
