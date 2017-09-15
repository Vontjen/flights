package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Passenger;
import be.dekkercorp.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassengerRestController {

    @Autowired
    PassengerRepository pr;

    @Autowired
    TicketRepository tr;

    @RequestMapping(method = RequestMethod.GET, path = "/api/passenger/all", produces = "application/json")
    public List<Passenger> allPassengers(){
        return pr.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/passenger/{pid}", produces = "application/json")
    public Passenger passengerById(@PathVariable("pid") int id){
        return pr.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/api/passenger/{pid}")
    public void deletePassenger(@PathVariable("pid") int id){
        Passenger passenger = pr.findOne(id);
        for(Ticket ticket: passenger.getTickets()){
            ticket.setPassenger(null);
            tr.save(ticket);
        }
        pr.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/api/passenger", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Passenger> create(@RequestBody Passenger input) {
        if (input.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        pr.save(input);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/api/passenger", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Passenger> update(@RequestBody Passenger input) {
        if (input.getId() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        pr.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }





}
