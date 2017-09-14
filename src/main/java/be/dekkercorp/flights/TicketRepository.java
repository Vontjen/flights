package be.dekkercorp.flights;


import be.dekkercorp.flights.domain.Flight;
import be.dekkercorp.flights.domain.Passenger;
import be.dekkercorp.flights.domain.Ticket;
import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{


}

//import be.dekkercorp.flights.domain.Flight;
//import be.dekkercorp.flights.domain.Passenger;
//import be.dekkercorp.flights.domain.Ticket;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//@Component
//@Transactional
//public class TicketRepository {
//    @PersistenceContext
//    private EntityManager em;
//
//    public TicketRepository() {
//        System.out.println("Ticketrepository Bean wordt aangemaakt ");
//    }
//
//    public void persist(Passenger passenger, double price, Flight flight){
//        System.out.println("Persisting ticket");
//        Ticket t = new Ticket(price, flight, passenger);
//        em.persist(t);
//    }
//
//    public void save(Ticket p) {
//        em.persist(p);
//    }
//
//}
