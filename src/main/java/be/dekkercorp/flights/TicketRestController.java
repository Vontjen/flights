package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Passenger;
import be.dekkercorp.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TicketRestController {

    @Autowired
    TicketRepository tr;

    @RequestMapping(method = RequestMethod.GET, path = "/api/ticket/all", produces = "application/json")
    //@ResponseBody Niet meer nodig, de @RestController bovenaan de klasse zorgt ervoor dat alle methods hier "@ResponseBody" bevatten
    public List<Ticket> allTickets(){
        return tr.findAll();
    }

//    @RequestMapping(method = RequestMethod.GET, path = "/api/ticket", produces = "application/json")
//    public Ticket getById(@RequestParam("ticket_id") int id){
//        return tr.findOne(id);
//    }
    // 2 manieren: de bevenste werkt met localhost/api/ticket?ticket_id=1000 en die hieronder localhost/api/ticket/1000
    @RequestMapping(method = RequestMethod.GET, path = "/api/ticket/{tid}", produces = "application/json")
    public Ticket getById(@PathVariable("tid") int id){
        return tr.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/api/ticket/{tid}")
    public void deleteTicket(@PathVariable("tid") int id){
        tr.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/api/ticket", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Ticket> create(@RequestBody Ticket input) {
        if (input.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        tr.save(input);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/api/ticket", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Ticket> update(@RequestBody Ticket input) {
        if (input.getId() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        tr.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }

}
