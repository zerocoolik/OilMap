package su.oilmap.oilmap.service;

import su.oilmap.oilmap.domain.Coordinates;
import su.oilmap.oilmap.domain.Station;

public interface StationService {
    Iterable<Station> getStationById(Long id);
    Iterable<Station> getListStation(Coordinates coordinates);
}
