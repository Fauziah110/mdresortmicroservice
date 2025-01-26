package com.mdresort.microservice.repository;

import com.mdresort.microservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByEmail(String email);
    void deleteById(Long id); // Make sure this matches the type of id in Customer class
}
