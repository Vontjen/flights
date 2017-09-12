package be.dekkercorp.flights;

import java.util.ArrayList;
import java.util.List;

public class PassengerRepository {

    private List<String> passengers = new ArrayList<>();

    public PassengerRepository() {

        System.out.println("PassengerRepository bean wordt gemaakt");

    }

    public List<String> getPassengers() {
        return passengers;
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
