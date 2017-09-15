package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import be.dekkercorp.flights.domain.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
