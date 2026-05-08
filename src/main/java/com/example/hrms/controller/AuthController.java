package com.example.hrms.controller;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
 
    // Login
    @PostMapping("/login")
    public String login() {
 
        return "Login Successful";
    }
 
    // Logout
    @PostMapping("/logout")
    public String logout() {
 
        return "Logout Successful";
    }
 
    // Refresh Token
    @PostMapping("/refresh")
    public String refreshToken() {
 
        return "Token Refreshed";
    }
}
 