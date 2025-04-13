package com.avelasquezz.cleango.controller;

import com.avelasquezz.cleango.model.Customer;
import com.avelasquezz.cleango.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
  @Autowired
  private CustomerService customerService;

  @PostMapping("/save")
  public Customer saveCustomer(@RequestBody Customer customer) {
    return customerService.saveCustomer(customer);
  }

  @GetMapping("/all")
  public List<Customer> getAllCustomers() {
    return customerService.getAllCustomers();
  }

  @PostMapping("/update/{customerID}")
  public Customer updateCustomer(@PathVariable int customerID, @RequestBody Customer customer) {
    return customerService.updateCustomer(customerID, customer);
  }

  @GetMapping("/findByEmail/{email}")
  public Customer findByEmail(@PathVariable String email) {
    return customerService.findByEmail(email);
  }

  @DeleteMapping("/delete/{customerID}")
  public boolean deleteCustomer(@PathVariable int customerID) {
    return customerService.deleteCustomer(customerID);
  }
}