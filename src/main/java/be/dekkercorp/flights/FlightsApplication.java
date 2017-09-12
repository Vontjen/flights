package be.dekkercorp.flights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class FlightsApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(FlightsApplication.class, args);

		PassengerService ps = ac.getBean(PassengerService.class);
        List<String> passengers = ps.getAll();

        passengers.forEach(System.out::println);



    }
}
