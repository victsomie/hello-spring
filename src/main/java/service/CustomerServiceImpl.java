package service;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;

import java.util.List;


// This is where the business logic resides
@Service("customerService")
//@Scope("singleton")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {

    //@Autowired
    private CustomerRepository customerRepository; // = new HibernateCustomerRepositoryImpl();

    // Empty contructor
    public CustomerServiceImpl(){
    }

    // Using constructor injection
    public CustomerServiceImpl(CustomerRepository customerRepository){
        System.out.println("We are using constructor injection");
        this.customerRepository = customerRepository;
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using setter injection");
        this.customerRepository = customerRepository;
    }

    // Method to return a List of customers
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
