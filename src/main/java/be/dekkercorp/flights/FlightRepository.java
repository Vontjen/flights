package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class FlightRepository {
    @PersistenceContext
    EntityManager em;

    public FlightRepository() {
        System.out.println("FlightRepository Bean wordt aaangemaakt");
    }

    public Flight readById(int id){
        System.out.println("Reading flight with id ");
        return em.find(Flight.class,id);
    }

    public void save(Flight f) {
        em.persist(f);
    }
}
