package be.dekkercorp.flights;


import java.util.List;

public class PassengerService {

    private PassengerRepository pr;

    public PassengerService(PassengerRepository pr){
        this.pr = pr;
        System.out.println("PassengerService bean wordt nu aangemaakt");
    }

    public List<String> getAll() {
        System.out.println("get all inside passengerservice");
        return pr.findAll();
//        List<String> passengers = new ArrayList<>();
//        passengers.add("Amy");
//        passengers.add("Joel");
//        passengers.add("Frank");
//        passengers.add("Burt");
//        passengers.add("Fred");
//        return passengers;

    }
}
