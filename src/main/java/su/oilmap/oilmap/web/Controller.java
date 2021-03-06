package su.oilmap.oilmap.web;


import org.springframework.web.bind.annotation.*;
import su.oilmap.oilmap.ResourceNotFoundException;
import su.oilmap.oilmap.domain.Station;
import su.oilmap.oilmap.service.StationService;

@RestController
@RequestMapping("api/v3/station/")
public class Controller {

    private final StationService stationService;

    public Controller(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Station getById(@PathVariable long id) {
        return stationService.getStationById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Station", "Id", id));
    }

}
