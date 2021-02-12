package su.oilmap.oilmap.service;

import com.fasterxml.jackson.databind.ObjectReader;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;
import su.oilmap.oilmap.domain.Coordinates;
import su.oilmap.oilmap.domain.Station;
import su.oilmap.oilmap.repositiry.StationRepository;

@Component("stationService")
public class StationServiceImpl implements StationService {

    private final StationRepository stationRepository;

    public StationServiceImpl(ObjectProvider<StationRepository> repositoryProvider) {
        this.stationRepository = repositoryProvider.getIfUnique();
    }

    @Override
    public Iterable<Station> getStationById(Long id) {
        return stationRepository.findStationById(id);
    }

    @Override
    public Iterable<Station> getListStation(Coordinates coordinates) {
        return stationRepository.findStationByCoordinates(coordinates);
    }
}
