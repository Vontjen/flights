package be.dekkercorp.flights.domain;


import javax.persistence.*;


@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false)
    private String number;
    @Column(nullable = false)
    private String destination;
    @Column(nullable = false)
    private String departure;

    public Flight() {
        //default constructor for jpa
    }

    public Flight(String number, String destination, String departure) {
        this.number = number;
        this.destination = destination;
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public Integer getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
