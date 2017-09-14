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

    public TicketService(TicketRepository ticketRepository) {
        System.out.println("Ticketservice Bean wordt gemaakt");
        this.ticketRepository=ticketRepository;

    }

    public void save(Flight flight, double price, Passenger passenger){

        System.out.println("Creating ticket");
        Ticket ticket = new Ticket(price, flight, passenger);
        ticketRepository.save(ticket);
    }

    public void save(Ticket t){
        ticketRepository.save(t);
    }
}
