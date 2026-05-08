package com.example.hrms.dto;
 
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayrollDTO {
 
    private Long id;
 
    private Double basicSalary;
 
    private Double bonus;
 
    private Double deductions;
 
    private Double netSalary;
}