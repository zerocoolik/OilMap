package su.oilmap.oilmap.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import su.oilmap.oilmap.domain.Station;
import su.oilmap.oilmap.repositiry.StationRepository;

import java.util.Optional;

@Component("stationService")
public class StationServiceImpl implements StationService {

    @Autowired
    private final StationRepository stationRepository;

    public StationServiceImpl(ObjectProvider<StationRepository> repositoryProvider) {
        this.stationRepository = repositoryProvider.getIfUnique();
    }

    @Override
    public Optional<Station> getStationById(int id) {
        return stationRepository.findById(id);
    }

}
