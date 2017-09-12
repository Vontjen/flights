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
//
}
