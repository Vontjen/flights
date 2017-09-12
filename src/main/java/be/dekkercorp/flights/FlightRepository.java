package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import org.springframework.stereotype.Component;

@Component
public class FlightRepository {

    public FlightRepository() {
        System.out.println("FlightRepository Bean wordt aaangemaakt");
    }

    public Flight readById(int id){
        System.out.println("Reading flight with id ");
        return null;
    }
}
