package su.oilmap.oilmap.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "coordinates")
public class Coordinates {
    @Id
    @Column(name = "coordinates_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long coordinatesId;
    @Column(name = "geometry")
    private String geometry;
}
