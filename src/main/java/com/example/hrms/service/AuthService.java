package com.example.hrms.service;
 
import com.example.hrms.dto.AuthDTO;
 
public interface AuthService {
 
    String login(AuthDTO authDTO);
 
    String logout();
 
    String refreshToken();
}
 