package su.oilmap.oilmap.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import su.oilmap.oilmap.domain.Station;
import su.oilmap.oilmap.service.StationService;

@RestController
@RequestMapping("/station/")
public class Controller {
    private final StationService stationService;

    public Controller(StationService stationService) {
        this.stationService = stationService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<Station>> getById(@PathVariable long id) {
        return new ResponseEntity<>(stationService.getStationById(id), HttpStatus.OK);
    }

}
