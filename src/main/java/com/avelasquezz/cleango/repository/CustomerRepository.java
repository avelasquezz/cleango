package com.avelasquezz.cleango.repository;

import com.avelasquezz.cleango.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
  // Custom query methods can be defined here if needed
  // For example, findByEmail(String email) or findByPhoneNumber(String phoneNumber)
  Customer findByCustomerEmail(String email);
  boolean existsByCustomerEmailAndPassword(String customerEmail, String password);
}