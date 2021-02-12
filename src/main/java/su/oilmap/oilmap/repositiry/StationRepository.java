package su.oilmap.oilmap.repositiry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import su.oilmap.oilmap.domain.Coordinates;
import su.oilmap.oilmap.domain.Station;

public interface StationRepository extends CrudRepository<Station,Long> {
    Iterable<Station> findStationByCoordinates(Coordinates coordinates);
    Iterable<Station> findStationById(Long id);
}
