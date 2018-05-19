package service;

import model.Customer;
import repository.CustomerRepository;

import java.util.List;


// This is where the busines logic resides

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository; // = new HibernateCustomerRepositoryImpl();

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
