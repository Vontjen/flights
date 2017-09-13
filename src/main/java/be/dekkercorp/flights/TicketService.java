package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import be.dekkercorp.flights.domain.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        System.out.println("Ticketservice Bean wordt gemaakt");
        this.ticketRepository=ticketRepository;

    }

    public void create(Flight flight, double price, Passenger passenger){

        System.out.println("Creating ticket");
        ticketRepository.persist(passenger,price,flight);
    }
}
