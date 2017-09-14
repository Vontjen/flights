package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import be.dekkercorp.flights.domain.Passenger;
import be.dekkercorp.flights.domain.Ticket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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
        PassengerService ps = ac.getBean(PassengerService.class);
        TicketService ts = ac.getBean(TicketService.class);
        FlightService fs = ac.getBean(FlightService.class);
        FlightRepository fr = ac.getBean(FlightRepository.class);

//        ps.save("Hola", "Luja");


        Passenger p = new Passenger("John", "Frank");
        ps.save(p);

        Ticket t = new Ticket(98.54);
        ts.save(t);

        Flight f = new Flight("ABB546", "Londen", "Paris");
//        fs.save(f);
        rs.bookTicketForFlight(4000, 4000);

        fr.save(f);







//        List<Passenger> passengers = pr.findAll();
//
//
//
//        for (Passenger pa : passengers) {
//            System.out.println(pa.getFirstName());
//        }

//        System.out.println(fr.findByNumber("ABA212"));



    }
}
