package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import be.dekkercorp.flights.domain.Passenger;
import be.dekkercorp.flights.domain.Ticket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class FlightsApplication {

    public static void main(String[] args) {

        ApplicationContext ac = SpringApplication.run(FlightsApplication.class, args);

//        PassengerService ps = ac.getBean(PassengerService.class);
//        List<String> passengers = ps.getAll();
//
//        passengers.forEach(System.out::println);

        ReservationService rs = ac.getBean(ReservationService.class);
        PassengerRepository pr = ac.getBean(PassengerRepository.class);
        TicketRepository tr = ac.getBean(TicketRepository.class);
        FlightRepository fr = ac.getBean(FlightRepository.class);


        Passenger p = new Passenger("John", "Frank");
        pr.save(p);

        Ticket t = new Ticket(98.54);
        tr.save(t);

       Flight f = new Flight("ABB546","Londen","Paris");
        fr.save(f);
        rs.bookTicketForFlight(1, 1);
    }
}
