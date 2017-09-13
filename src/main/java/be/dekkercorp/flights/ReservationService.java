package be.dekkercorp.flights;
import be.dekkercorp.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservationService {
    @Autowired
    private FlightService flightService;
    @Autowired
    private TicketService ticketService;
    @Autowired
    private PassengerService passengerService;

    public ReservationService() {
        System.out.println("De ReservationService Bean wordt aangemaakt");
    }

    public void bookTicketForFlight(int passengerId, int flightId){
        System.out.println("Booking Ticket ");
        ticketService.create(flightService.findById(flightId), 320.5, passengerService.findById(passengerId));
    }
}
