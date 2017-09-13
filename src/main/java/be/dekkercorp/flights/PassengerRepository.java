package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Passenger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
public class PassengerRepository {
    @PersistenceContext
    private EntityManager em;


    public PassengerRepository() {
        System.out.println("PassengerRepository bean wordt gemaakt");
    }


    public Passenger readById(int id) {
        System.out.println("Reading id of passenger");
        return em.find(Passenger.class,id);
    }

    public void save(Passenger p) {
        em.persist(p);
    }

}
