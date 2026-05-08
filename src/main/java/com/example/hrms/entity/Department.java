package com.example.hrms.entity;
 
import com.fasterxml.jackson.annotation.JsonIgnore;
 
import jakarta.persistence.*;
 
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
 
import java.util.List;
 
@Entity
@Table(name = "departments")
 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 
public class Department {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String departmentName;
 
    @OneToMany(mappedBy = "department")
    @JsonIgnore
    private List<Employee> employees;
}
 