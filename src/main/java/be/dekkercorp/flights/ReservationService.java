package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Flight;
import be.dekkercorp.flights.domain.Passenger;
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

    public Ticket bookTicketForFlight(Passenger passenger, Flight flight){
        System.out.println("Booking Ticket ");
        return ticketService.create(flight, 320.5,passenger);
    }
}
