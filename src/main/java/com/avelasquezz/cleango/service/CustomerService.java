package com.avelasquezz.cleango.service;

import com.avelasquezz.cleango.model.Customer;
import com.avelasquezz.cleango.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
  @Autowired
  private CustomerRepository customerRepository;

  public Customer saveCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  public Customer updateCustomer(int customerID, Customer customer) {
    Customer existingCustomer = customerRepository.findById(customerID).orElse(null);

    if (existingCustomer != null) {
      existingCustomer.setCustomerEmail(customer.getCustomerEmail());
      existingCustomer.setPassword(customer.getPassword());
      existingCustomer.setBirthDate(customer.getBirthDate());
      existingCustomer.setName(customer.getName());
      existingCustomer.setLastName(customer.getLastName());
      existingCustomer.setSecondLastName(customer.getSecondLastName());
      existingCustomer.setPhoneNumber(customer.getPhoneNumber());
      existingCustomer.setStatus(customer.isStatus());
      return customerRepository.save(existingCustomer);
    }

    return null;
  }

  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }

  public Customer findByEmail(String email) {
    return customerRepository.findByCustomerEmail(email);
  }

  public boolean deleteCustomer(int customerID) {
    if (customerRepository.existsById(customerID)) {
      customerRepository.deleteById(customerID);
      return true;
    }

    return false;
  }
}