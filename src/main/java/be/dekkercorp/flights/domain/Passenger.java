package be.dekkercorp.flights.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public String firstName;
    public String lastName;
    private int frequentFlyerMiles;
    @OneToMany(mappedBy = "passenger")
    private List<Ticket> tickets= new ArrayList<>();
//
//    public List<Ticket> getTickets() {
//        return tickets;
//    }

//    public void setTickets(List<Ticket> tickets) {
//        this.tickets = tickets;
//    }

    public Passenger() {
    }

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.frequentFlyerMiles = 0;
    }

    @XmlAttribute(name = "id")
    public Integer getId() {
        return id;
    }

    @XmlElement(name = "first")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @JsonProperty("abc")

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFrequentFlyerMiles() {
        return frequentFlyerMiles;
    }

    public void setFrequentFlyerMiles(int frequentFlyerMiles) {
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public String fullname() {
        return firstName+" "+lastName;
    }


    @JsonIgnore
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
}
