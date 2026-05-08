package com.example.hrms.entity;
 
import jakarta.persistence.*;

import lombok.*;
import java.time.LocalDate;
import lombok.* ;

@Entity
@Table(name = "attendance")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Attendance {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private LocalDate attendanceDate;
    private String status;
 
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}