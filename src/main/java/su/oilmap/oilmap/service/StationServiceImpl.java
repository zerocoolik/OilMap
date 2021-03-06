package su.oilmap.oilmap.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;
import su.oilmap.oilmap.domain.Station;
import su.oilmap.oilmap.repositiry.StationRepository;

import java.util.Optional;

@Component("stationService")
public class StationServiceImpl implements StationService {


    private final StationRepository stationRepository;

    public StationServiceImpl(ObjectProvider<StationRepository> repositoryProvider) {
        this.stationRepository = repositoryProvider.getIfUnique();
    }

    @Override
    public Optional<Station> getStationById(long id) {
        return stationRepository.findStationById(id);
    }


}
