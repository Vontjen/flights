package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Passenger;
import org.springframework.stereotype.Repository;


@Repository
public class PassengerRepository {


    public PassengerRepository() {
        System.out.println("PassengerRepository bean wordt gemaakt");
    }

    public Passenger readById(int id){
        System.out.println("Reading id of passenger");
        return null;
    }





}
