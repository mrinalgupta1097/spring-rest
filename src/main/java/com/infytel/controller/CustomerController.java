package com.infytel.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    // fetching the customers details
    @GetMapping
    public String fetchCustomer(){
        return "customers fetched successfully";
    }

    // adding a new customer
    @PostMapping
    public String createCustomer(){
        return "customer added successfully";
    }

    @PutMapping
    public String updateCustomer(){
        return "customer updated successfully";

    }
    @DeleteMapping
    public String deleteCustomer(){
        return "customer deleted successfully";
    }
}
