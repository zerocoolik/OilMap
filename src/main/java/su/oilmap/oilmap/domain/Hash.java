package su.oilmap.oilmap.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hash")
public class Hash {
  @Id
  @Column(name = "hash_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "hash")
  private String hash;
}
