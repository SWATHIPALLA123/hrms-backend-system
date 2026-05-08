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
public class AttendanceDTO {
 
    private Long id;
 
    private LocalDate attendanceDate;
 
    private String status;
}