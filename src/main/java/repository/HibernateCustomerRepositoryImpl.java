package repository;


import model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/*
* This
* */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<Customer>();

        // Create a new customer
        Customer customer = new Customer();
        customer.setFirstName("Bryan");
        customer.setLastName("Gregg");

        customers.add(customer);

        return customers;

    }
}
