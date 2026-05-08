package com.example.hrms.service.impl;
 
import com.example.hrms.dto.AuthDTO;
import com.example.hrms.security.JwtUtil;
import com.example.hrms.service.AuthService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class AuthServiceImpl
        implements AuthService {
 
    @Autowired
    private JwtUtil jwtUtil;
 
    @Override
    public String login(AuthDTO authDTO) {
 
        // Dummy Login Validation
 
        if ("admin".equals(authDTO.getUsername())
                &&
                "admin123".equals(authDTO.getPassword())) {
 
            return jwtUtil.generateToken(
                    authDTO.getUsername());
        }
 
        return "Invalid Username or Password";
    }
 
    @Override
    public String logout() {
 
        return "Logout Successful";
    }
 
    @Override
    public String refreshToken() {
 
        return "Token Refreshed Successfully";
    }
}
 