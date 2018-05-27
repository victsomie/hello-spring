import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import repository.CustomerRepository;
import repository.HibernateCustomerRepositoryImpl;
import service.CustomerService;
import service.CustomerServiceImpl;

//Configuration sets the class as a configuration class
@Configuration
@ComponentScan({"service", "repository"}) // These pass package name where to support autowiring
public class AppConfig {

//    @Bean(name = "customerService")
//    public CustomerService getCustomerService(){
//        // return new CustomerServiceImpl();
//
//        // Using constructor injection. NB: Method is passed as parameter
//        //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//
//        // Using setter injection. NB: No parameter is passed. We use the setter to set it
//        CustomerServiceImpl service = new CustomerServiceImpl();
//        //service.setCustomerRepository(getCustomerRepository());
//
//        return  service;
//    }
//
//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository(){
//        return new HibernateCustomerRepositoryImpl();
//    }
}
