package com.avelasquezz.cleango.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avelasquezz.cleango.dto.LoginRequest;
import com.avelasquezz.cleango.service.LoginService;

@RestController
@RequestMapping("/auth")
public class LoginContoller {
  @Autowired
  private LoginService loginService;

  @PostMapping("/login")
  boolean login(@RequestBody LoginRequest loginRequest) {
    return loginService.login(loginRequest.getEmail(), loginRequest.getPassword());
  }
}