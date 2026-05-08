package com.example.hrms.controller;
 
import com.example.hrms.entity.LeaveRequest;
import com.example.hrms.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/v1/leaves")
public class LeaveController {
 
    @Autowired
    private LeaveRepository leaveRepository;
 
    // Apply Leave
    @PostMapping
    public LeaveRequest applyLeave(
            @RequestBody LeaveRequest leaveRequest) {
 
        return leaveRepository.save(leaveRequest);
    }
 
    // Get All Leaves
    @GetMapping
    public List<LeaveRequest> getAllLeaves() {
 
        return leaveRepository.findAll();
    }
 
    // Get Leave By ID
    @GetMapping("/{id}")
    public LeaveRequest getLeaveById(@PathVariable Long id) {
 
        return leaveRepository.findById(id).orElse(null);
    }
 
    // Approve Leave
    @PutMapping("/{id}/approve")
    public LeaveRequest approveLeave(@PathVariable Long id) {
 
        LeaveRequest leave =
                leaveRepository.findById(id).orElse(null);
 
        leave.setStatus("APPROVED");
 
        return leaveRepository.save(leave);
    }
 
    // Reject Leave
    @PutMapping("/{id}/reject")
    public LeaveRequest rejectLeave(@PathVariable Long id) {
 
        LeaveRequest leave =
                leaveRepository.findById(id).orElse(null);
 
        leave.setStatus("REJECTED");
 
        return leaveRepository.save(leave);
    }
 
    // Delete Leave
    @DeleteMapping("/{id}")
    public String deleteLeave(@PathVariable Long id) {
 
        leaveRepository.deleteById(id);
 
        return "Leave Deleted Successfully";
    }
}
 