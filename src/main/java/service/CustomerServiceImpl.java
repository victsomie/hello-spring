package service;

import model.Customer;
import repository.CustomerRepository;

import java.util.List;


// This is where the business logic resides
public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository; // = new HibernateCustomerRepositoryImpl();
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Method to return a List of customers
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
