package com.example.hrms.service;
 
import com.example.hrms.dto.AttendanceDTO;
 
import java.util.List;
 
public interface AttendanceService {
 
    AttendanceDTO markAttendance(
            AttendanceDTO attendanceDTO);
 
    List<AttendanceDTO> getAllAttendance();
 
    AttendanceDTO getAttendanceById(Long id);
 
    AttendanceDTO updateAttendance(
            Long id,
            AttendanceDTO attendanceDTO);
 
    void deleteAttendance(Long id);
}
 