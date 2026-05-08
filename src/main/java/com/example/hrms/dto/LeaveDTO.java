package com.example.hrms.dto;
 
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
import java.time.LocalDate;
 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LeaveDTO {
 
    private Long id;
 
    private LocalDate fromDate;
 
    private LocalDate toDate;
 
    private String reason;
 
    private String status;
}
 