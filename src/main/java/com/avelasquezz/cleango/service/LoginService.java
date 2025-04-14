package com.avelasquezz.cleango.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.avelasquezz.cleango.repository.CustomerRepository;

@Service
public class LoginService {
  @Autowired
  private CustomerRepository customerRepository; 

  public boolean login(String customerEmail, String password) {
    return customerRepository.existsByCustomerEmailAndPassword(customerEmail, password);
  }
}