package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import be.dekkercorp.flights.domain.Passenger;
import be.dekkercorp.flights.domain.Ticket;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class TicketRepository {
    @PersistenceContext
    private EntityManager em;

    public TicketRepository() {
        System.out.println("Ticketrepository Bean wordt aangemaakt ");
    }

    public void persist(Passenger passenger, double price, Flight flight){
        System.out.println("Persisting ticket");
        Ticket t = new Ticket(price, flight, passenger);
        em.persist(t);
    }

    public void save(Ticket p) {
        em.persist(p);
    }

}
