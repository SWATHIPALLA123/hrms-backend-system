package com.example.hrms.entity;
 
import jakarta.persistence.*;
import lombok.* ;
@Entity
@Table(name = "payroll")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payroll {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private Double basicSalary;
    private Double bonus;
    private Double deductions;
    private Double netSalary;
 
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
 