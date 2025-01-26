package com.mdresort.microservice.controller;

import com.mdresort.microservice.model.Customer;
import com.mdresort.microservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<Void> registerCustomer(@RequestBody Customer customer) {
        String result = customerService.registerCustomer(customer);

        if ("Registration successful!".equals(result)) {
            return ResponseEntity.ok().build(); // Return 200 OK status
        }
        return ResponseEntity.badRequest().build(); // Return 400 Bad Request status for failure
    }

    @GetMapping
    public String welcome() {
        return "Welcome to the Customer API!";
    }
}
