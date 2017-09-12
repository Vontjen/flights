package be.dekkercorp.flights;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class FlightsConfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/flights");
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        return ds;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManager(DataSource ds, JpaVendorAdapter jva){
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(ds);
        emf.setJpaVendorAdapter(jva);
        emf.setPackagesToScan("be.dekkercorp.flights");
        return emf;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setGenerateDdl(true);
        adapter.setShowSql(true);
        return adapter;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        return new JpaTransactionManager(emf);
    }



//    @Bean
//    public List<String> names(){
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Fred");
//        names.add("Tom");
//        return names;
//    }
//    Niet meer echt nodig, de @Component en @Autowire vervangen de configuratie van de Beans, deenige Beans dat nog geschreven moeten
//    worden is als:
//    1. Meerdere Beans nodig voor 1 component
//    2. Beans nodig voor code die niet van ons is (zoals Arralists)
//
//    @Bean
//    public String myCoolBean(){
//        return "cool bean";
//    }
//
//    @Bean
//    public String myOtherBean(){
//        return "Somehting else";
//    }
//    @Bean
//    public PassengerService myPassengerService(PassengerRepository pr){
//        return new PassengerService(pr);
//    }
//
//    @Bean
//    public PassengerRepository myPassengerRepository(){
//        return new PassengerRepository();
//    }
}
