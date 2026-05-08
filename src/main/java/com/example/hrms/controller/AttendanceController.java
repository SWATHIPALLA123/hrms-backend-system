package com.example.hrms.controller;
 
import com.example.hrms.entity.Attendance;
import com.example.hrms.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/v1/attendance")
public class AttendanceController {
 
    @Autowired
    private AttendanceRepository attendanceRepository;
 
    // Mark Attendance
    @PostMapping
    public Attendance markAttendance(
            @RequestBody Attendance attendance) {
 
        return attendanceRepository.save(attendance);
    }
 
    // Get All Attendance
    @GetMapping
    public List<Attendance> getAllAttendance() {
 
        return attendanceRepository.findAll();
    }
 
    // Get Attendance By ID
    @GetMapping("/{id}")
    public Attendance getAttendanceById(@PathVariable Long id) {
 
        return attendanceRepository.findById(id).orElse(null);
    }
 
    // Update Attendance
    @PutMapping("/{id}")
    public Attendance updateAttendance(@PathVariable Long id,
                                       @RequestBody Attendance attendance) {
 
        Attendance existingAttendance =
                attendanceRepository.findById(id).orElse(null);
 
        existingAttendance.setAttendanceDate(
                attendance.getAttendanceDate());
 
        existingAttendance.setStatus(
                attendance.getStatus());
 
        return attendanceRepository.save(existingAttendance);
    }
 
    // Delete Attendance
    @DeleteMapping("/{id}")
    public String deleteAttendance(@PathVariable Long id) {
 
        attendanceRepository.deleteById(id);
 
        return "Attendance Deleted Successfully";
    }
}
 