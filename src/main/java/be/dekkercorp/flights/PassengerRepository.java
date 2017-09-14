package be.dekkercorp.flights;

//import be.dekkercorp.flights.domain.Passenger;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;


import be.dekkercorp.flights.domain.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {


}

//
//@Repository
//@Transactional
//public class PassengerRepository {
//    @PersistenceContext
//    private EntityManager em;
//
//
//    public PassengerRepository() {
//        System.out.println("PassengerRepository bean wordt gemaakt");
//    }
//
//
//    public Passenger readById(int id) {
//        System.out.println("Reading id of passenger");
//        return em.find(Passenger.class,id);
//    }
//
//    public void save(Passenger p) {
//        em.persist(p);
//    }
//
//    public List<Passenger> findAll(){
//
//        return em.createQuery("select p from Passenger p order by first_name asc ", Passenger.class).getResultList();
//    }
//
//}


