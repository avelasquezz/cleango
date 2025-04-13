package com.avelasquezz.cleango.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincerment ID
  private int customerId;

  @Column(unique = true, nullable = false, length = 100)
  @Email(message = "Invalid email format")
  @NotBlank(message = "Email cannot be blank")
  private String customerEmail;

  @Column(nullable = false, length = 100)
  @Size(min = 8, message = "Password must be at least 8 characters long")
  @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$", message = "Password must contain at least one uppercase letter, one lowercase letter and one digit")
  private String password;

  @Column(nullable = false)
  @Past(message = "Birth date must be in the past")
  private LocalDate birthDate;

  @Column(nullable = false, length = 50)
  @NotBlank(message = "Name cannot be blank")
  private String name;

  @Column(nullable = false, length = 50)
  @NotBlank(message = "Last name cannot be blank")
  private String lastName;

  @Column(length = 50)
  private String secondLastName;

  @Column(unique = true, length = 15)
  @NotBlank(message = "Phone number cannot be blank")
  @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Phone number must contain only digits and optionally start with '+'")
  @Size(min = 10, max = 15, message = "Phone number must be between 10 and 15 digits")
  private String phoneNumber; 

  @Column(nullable = false)
  private boolean status = true;

  // Getter and setter methods
  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }         

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSecondLastName() {
    return secondLastName;
  }

  public void setSecondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}