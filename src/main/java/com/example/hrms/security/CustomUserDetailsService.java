package com.example.hrms.security;
 
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
 
import org.springframework.security.core.userdetails.UsernameNotFoundException;
 
import org.springframework.stereotype.Service;
 
import java.util.ArrayList;
 
@Service
public class CustomUserDetailsService
        implements UserDetailsService {
 
    @Override
    public UserDetails loadUserByUsername(
            String username)
 
            throws UsernameNotFoundException {
 
        // Dummy User Authentication
 
        if ("admin".equals(username)) {
 
            return new User(
                    "admin",
                    "admin123",
                    new ArrayList<>()
            );
        }
 
        throw new UsernameNotFoundException(
                "User Not Found");
    }
}
 