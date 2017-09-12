package be.dekkercorp.flights;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FlightsConfig {

    @Bean
    public List<String> names(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Fred");
        names.add("Tom");
        return names;
    }
//    Niet meer echt nodig, de @Component en @Autowire vervangen de configuratie van de Beans, deenige Beans dat nog geschreven moeten
//    worden is als:
//    1. Meerdere Beans nodig voor 1 component
//    2. Beans nodig voor code die niet van ons is (zoals Arralists)
//
//    @Bean
//    public String myCoolBean(){
//        return "cool bean";
//    }
//
//    @Bean
//    public String myOtherBean(){
//        return "Somehting else";
//    }
//    @Bean
//    public PassengerService myPassengerService(PassengerRepository pr){
//        return new PassengerService(pr);
//    }
//
//    @Bean
//    public PassengerRepository myPassengerRepository(){
//        return new PassengerRepository();
//    }
}
