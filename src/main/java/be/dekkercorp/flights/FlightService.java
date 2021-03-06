package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class FlightService {
    @Autowired
    FlightRepository flightRepository;
//    @PersistenceContext
//    EntityManager em;

    public FlightService(FlightRepository flightRepository) {
        System.out.println("Flightservice Bean wordt aangemaakt");
        this.flightRepository = flightRepository;
    }

    public Flight findById(int id){

        return flightRepository.getOne(id);
    }

    public void save(String number, String departure, String destination){
        Flight flight = new Flight(number, departure, destination);
        flightRepository.save(flight);
    }

    public void save(Flight flight){
        flightRepository.save(flight);
    }


}
