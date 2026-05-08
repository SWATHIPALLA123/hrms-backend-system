package com.example.hrms.entity;
 
import jakarta.persistence.*;
import lombok.*;
 
@Entity
@Table(name = "users")
 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String username;
 
    private String password;
 
    // Relationship with Role
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
 