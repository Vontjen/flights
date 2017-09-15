package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import be.dekkercorp.flights.domain.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FlightRestController {
    @Autowired
    FlightRepository fr;

    @RequestMapping(method = RequestMethod.GET, path = "/api/flight/all", produces = "application/json")
    public List<Flight> allFlights(){
        return fr.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/flight/{fid}", produces = "application/json")
    public Flight passengerById(@PathVariable("fid") int id){
        return fr.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/api/flight/{fid}")
    public void deletePassenger(@PathVariable("fid") int id){

        fr.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/api/flight", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Flight> create(@RequestBody Flight input) {
        if (input.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        fr.save(input);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/api/flight", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Flight> update(@RequestBody Flight input) {
        if (input.getId() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        fr.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }
}
