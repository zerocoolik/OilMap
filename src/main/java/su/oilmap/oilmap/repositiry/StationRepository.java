package su.oilmap.oilmap.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import su.oilmap.oilmap.domain.Station;

import java.util.Optional;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {
    Optional<Station> findStationById(long id);
}
