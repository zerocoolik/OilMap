package su.oilmap.oilmap.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "provider")
public class Provider {
  @Id
  @Column(name = "provider_id")
  private long id;
  @Column(name = "name")
  private String name;
  @Column(name = "url_logo")
  private String urlLogo;
}
