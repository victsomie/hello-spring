package service;

import model.Customer;
import repository.CustomerRepository;

import java.util.List;


// This is where the busines logic resides

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository; // = new HibernateCustomerRepositoryImpl();


    // Empty Constructor
    public CustomerServiceImpl(){

    }

    // Constructor for class
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Method to return a List of customers
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
