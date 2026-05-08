package com.example.hrms.entity;
 
import jakarta.persistence.*;
import lombok.*;
import lombok.*;
@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String firstName;
    
    private String lastName;
    
    @Column(unique=true)
    private String email;
    
    private Double salary;
 
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
 