package be.dekkercorp.flights;


import be.dekkercorp.flights.domain.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Component
public class PassengerService {
    @Autowired
    private PassengerRepository pr;
    @PersistenceContext
    EntityManager em;

    public PassengerService(PassengerRepository pr){
        this.pr = pr;
        System.out.println("PassengerService bean wordt nu aangemaakt");
    }

    public List<String> getAll() {
        System.out.println("get all inside passengerservice");
        List<String> passengers = new ArrayList<>();
        passengers.add("Amy");
        passengers.add("Joel");
        passengers.add("Frank");
        passengers.add("Burt");
        passengers.add("Fred");
        return passengers;

    }

    public Passenger findById(int id){

        System.out.println("Finding passenger with id " +id);
        return em.find(Passenger.class, id);
    }



}
