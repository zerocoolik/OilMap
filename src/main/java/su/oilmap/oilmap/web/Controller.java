package su.oilmap.oilmap.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import su.oilmap.oilmap.ResourceNotFoundException;
import su.oilmap.oilmap.domain.Station;
import su.oilmap.oilmap.service.StationService;

@RestController
@RequestMapping("api/v3/station/")
public class Controller {

    @Autowired
    private final StationService stationService;

    public Controller(StationService stationService) {
        this.stationService = stationService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Station getById(@PathVariable long id) {
        return stationService.getStationById((int)id)
                .orElseThrow(()->new ResourceNotFoundException("Station","Id",id));
    }

}
