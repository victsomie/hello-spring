import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.CustomerRepository;
import repository.HibernateCustomerRepositoryImpl;
import service.CustomerService;
import service.CustomerServiceImpl;

//Configuration sets the class as a configuration class
@Configuration
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService(){
        // return new CustomerServiceImpl();
        CustomerServiceImpl service = new CustomerServiceImpl();
        service.setCustomerRepository(getCustomerRepository());
        return  service;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }
}
