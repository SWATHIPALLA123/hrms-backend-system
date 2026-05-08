package com.example.hrms.service;
 
import com.example.hrms.dto.LeaveDTO;
 
import java.util.List;
 
public interface LeaveService {
 
    LeaveDTO applyLeave(LeaveDTO leaveDTO);
 
    List<LeaveDTO> getAllLeaves();
 
    LeaveDTO getLeaveById(Long id);
 
    LeaveDTO approveLeave(Long id);
 
    LeaveDTO rejectLeave(Long id);
 
    void deleteLeave(Long id);
}