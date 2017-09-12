package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import be.dekkercorp.flights.domain.Passenger;
import be.dekkercorp.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Ticket create(Flight flight, double price, Passenger passenger){
        ticketRepository.persist(passenger,price,flight);
        System.out.println("Creating ticket");
        return null;
    }
}
