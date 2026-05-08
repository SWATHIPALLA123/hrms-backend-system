package com.example.hrms.entity;
 
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import lombok.*;
@Entity
@Table(name = "leave_request")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LeaveRequest {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private LocalDate fromDate;
    private LocalDate toDate;
    private String reason;
    private String status;
 
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
 