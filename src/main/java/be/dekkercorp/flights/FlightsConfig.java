package be.dekkercorp.flights;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class FlightsConfig {

    @Bean
    public String myCoolBean(){
        return "cool bean";
    }

    @Bean
    public String myOtherBean(){
        return "Somehting else";
    }
    @Bean
    public PassengerService myPassengerService(PassengerRepository pr){
        return new PassengerService(pr);
    }

    @Bean
    public PassengerRepository myPassengerRepository(){
        return new PassengerRepository();
    }

}
