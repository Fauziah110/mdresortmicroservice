
package com.microservice.mdresort.service;

import com.microservice.mdresort.model.Customer;
import com.microservice.mdresort.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Integer id, Customer customerDetails) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            customer.setCustomerName(customerDetails.getCustomerName());
            customer.setCustomerEmail(customerDetails.getCustomerEmail());
            customer.setCustomerPhoneNo(customerDetails.getCustomerPhoneNo());
            customer.setCustomerPassword(customerDetails.getCustomerPassword());
            return customerRepository.save(customer);
        }
        return null;
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }
}