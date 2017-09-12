package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import org.springframework.stereotype.Component;

@Component
public class FlightRepository {

    public Flight readById(int id){
        System.out.println("Reading flight with id "+id);
        return null;
    }
}
