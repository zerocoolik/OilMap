package su.oilmap.oilmap.domain;

import lombok.AllArgsConstructor;
import lombok.Data;


import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "station")
public class Station {
  @Id
  @Column(name = "station_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "provider_id",referencedColumnName = "provider_id")
  private Provider provider;
}
