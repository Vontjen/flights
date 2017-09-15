package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/flight")
public class FlightRestController {
    @Autowired
    FlightRepository fr;

    @RequestMapping(method = RequestMethod.GET, path = "all", produces = "application/json")
    public List<Flight> allFlights(){
        return fr.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "{fid}", produces = "application/json")
    public Flight passengerById(@PathVariable("fid") int id){
        return fr.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "{fid}")
    public void deletePassenger(@PathVariable("fid") int id){

        fr.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Flight> create(@RequestBody Flight input) {
        if (input.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        fr.save(input);
        return new ResponseEntity<>(input, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Flight> update(@RequestBody Flight input) {
        if (input.getId() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        fr.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }
}
