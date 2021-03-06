package su.oilmap.oilmap.service;

import su.oilmap.oilmap.domain.Station;

import java.util.Optional;

public interface StationService {
    Optional<Station> getStationById(long id);
}
