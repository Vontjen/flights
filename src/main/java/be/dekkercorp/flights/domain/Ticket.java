package be.dekkercorp.flights.domain;


import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private double price;
    @ManyToOne
    private Flight flight;
    @ManyToOne
    private Passenger passenger;

    Ticket() {
        //default constructor for JPA
    }

    public Ticket(double price) {
        this.price = price;
    }

    public Ticket(double price, Flight flight, Passenger passenger) {
        this.price = price;
        this.flight = flight;
        this.passenger = passenger;
    }

    public Integer getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
        passenger.addTicket(this);
    }
}
