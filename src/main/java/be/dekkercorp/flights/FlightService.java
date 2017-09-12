package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        System.out.println("Flightservice Bean wordt aangemaakt");
        this.flightRepository = flightRepository;
    }

    public Flight findById(int id){

        System.out.println("Finding flight by id");
        return flightRepository.readById(id);
    }


}
