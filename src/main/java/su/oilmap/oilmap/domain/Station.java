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
    @JoinColumn(name = "info_id", referencedColumnName = "info_id")
    private Info info;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "provider_id", referencedColumnName = "provider_id")
    private Provider provider;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coordinates_id", referencedColumnName = "coordinates_id")
    private Coordinates coordinates;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oil_type_id", referencedColumnName = "oil_type_id")
    private OilType oilType;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_type_id", referencedColumnName = "service_type_id")
    private ServiceType serviceType;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hash_id", referencedColumnName = "hash_id")
    private Hash hash;
}
