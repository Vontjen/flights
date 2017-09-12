package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import be.dekkercorp.flights.domain.Passenger;
import be.dekkercorp.flights.domain.Ticket;
import org.springframework.stereotype.Component;

@Component
public class TicketRepository {

    public TicketRepository() {
        System.out.println("Ticketrepository Bean wordt aangemaakt ");
    }

    public Ticket persist(Passenger passenger, double price, Flight flight){
        System.out.println("Persisting ticket");
        return null;
    }

}
