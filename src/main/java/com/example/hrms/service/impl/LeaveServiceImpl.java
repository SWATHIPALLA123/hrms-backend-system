package com.example.hrms.service.impl;
 
import com.example.hrms.dto.LeaveDTO;
import com.example.hrms.entity.LeaveRequest;
import com.example.hrms.repository.LeaveRepository;
import com.example.hrms.service.LeaveService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.stream.Collectors;
 
@Service
public class LeaveServiceImpl
        implements LeaveService {
 
    @Autowired
    private LeaveRepository leaveRepository;
 
    @Override
    public LeaveDTO applyLeave(
            LeaveDTO leaveDTO) {
 
        LeaveRequest leave = new LeaveRequest();
 
        leave.setFromDate(
                leaveDTO.getFromDate());
 
        leave.setToDate(
                leaveDTO.getToDate());
 
        leave.setReason(
                leaveDTO.getReason());
 
        leave.setStatus(
                leaveDTO.getStatus());
 
        LeaveRequest savedLeave =
                leaveRepository.save(leave);
 
        return new LeaveDTO(
                savedLeave.getId(),
                savedLeave.getFromDate(),
                savedLeave.getToDate(),
                savedLeave.getReason(),
                savedLeave.getStatus()
        );
    }
 
    @Override
    public List<LeaveDTO> getAllLeaves() {
 
        return leaveRepository.findAll()
                .stream()
                .map(leave ->
                        new LeaveDTO(
                                leave.getId(),
                                leave.getFromDate(),
                                leave.getToDate(),
                                leave.getReason(),
                                leave.getStatus()
                        )
                ).collect(Collectors.toList());
    }
 
    @Override
    public LeaveDTO getLeaveById(Long id) {
 
        LeaveRequest leave =
                leaveRepository.findById(id)
                        .orElse(null);
 
        return new LeaveDTO(
                leave.getId(),
                leave.getFromDate(),
                leave.getToDate(),
                leave.getReason(),
                leave.getStatus()
        );
    }
 
    @Override
    public LeaveDTO approveLeave(Long id) {
 
        LeaveRequest leave =
                leaveRepository.findById(id)
                        .orElse(null);
 
        leave.setStatus("APPROVED");
 
        LeaveRequest updatedLeave =
                leaveRepository.save(leave);
 
        return new LeaveDTO(
                updatedLeave.getId(),
                updatedLeave.getFromDate(),
                updatedLeave.getToDate(),
                updatedLeave.getReason(),
                updatedLeave.getStatus()
        );
    }
 
    @Override
    public LeaveDTO rejectLeave(Long id) {
 
        LeaveRequest leave =
                leaveRepository.findById(id)
                        .orElse(null);
 
        leave.setStatus("REJECTED");
 
        LeaveRequest updatedLeave =
                leaveRepository.save(leave);
 
        return new LeaveDTO(
                updatedLeave.getId(),
                updatedLeave.getFromDate(),
                updatedLeave.getToDate(),
                updatedLeave.getReason(),
                updatedLeave.getStatus()
        );
    }
 
    @Override
    public void deleteLeave(Long id) {
 
        leaveRepository.deleteById(id);
    }
}
 