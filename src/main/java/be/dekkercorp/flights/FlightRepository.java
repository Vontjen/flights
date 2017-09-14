package be.dekkercorp.flights;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;


import be.dekkercorp.flights.domain.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

    Flight findByNumber(String number);

    Flight getByDepartureAndDestination (String dep, String des);
}

//Allemaal niet meer nodig met de interface methode hierboven
//
//@Component
//@Transactional
//public class FlightRepository {
//    @PersistenceContext
//    EntityManager em;
//
//    public FlightRepository() {
//        System.out.println("FlightRepository Bean wordt aaangemaakt");
//    }
//
//    public Flight querybyFlightNumber(String flightnumber){
//        TypedQuery<Flight> query = em.createQuery("select f from Flight f where f.number = :fn", Flight.class);
//        query.setParameter("fn", flightnumber);
//        return query.getSingleResult();
//    }
//
//    public Flight readById(int id){
//        System.out.println("Reading flight with id ");
//        return em.find(Flight.class,id);
//    }
//
//    public void save(Flight f) {
//        em.persist(f);
//    }
//}
