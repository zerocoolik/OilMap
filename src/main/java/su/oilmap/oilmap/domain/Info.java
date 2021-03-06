package su.oilmap.oilmap.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "info")
public class Info {
  @Id
  @Column(name = "info_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "name")
  private String name;
  @Column(name = "address")
  private String address;
  @Column(name = "telephone")
  private String telephone;
}
