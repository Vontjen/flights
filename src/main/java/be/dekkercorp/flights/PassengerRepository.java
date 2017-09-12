package be.dekkercorp.flights;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PassengerRepository {


    public PassengerRepository() {
        System.out.println("PassengerRepository bean wordt gemaakt");
    }

    public List<String> findAll() {
        List<String> passengers = new ArrayList<>();
        passengers.add("Amy");
        passengers.add("Joel");
        passengers.add("Frank");
        passengers.add("Burt");
        passengers.add("Fred");
        return passengers;

    }





}
