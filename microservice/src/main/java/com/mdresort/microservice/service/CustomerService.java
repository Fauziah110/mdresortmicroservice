package com.mdresort.microservice.service;

import com.mdresort.microservice.model.Customer;
import com.mdresort.microservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public String registerCustomer(Customer customer) {
        if (customerRepository.findByEmail(customer.getCustomerEmail()) != null) {
            return "Email already registered.";
        }
        customerRepository.save(customer);
        return "Registration successful!";
    }
}
