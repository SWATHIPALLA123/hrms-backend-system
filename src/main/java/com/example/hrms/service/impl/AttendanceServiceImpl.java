package com.example.hrms.service.impl;
 
import com.example.hrms.dto.AttendanceDTO;
import com.example.hrms.entity.Attendance;
import com.example.hrms.repository.AttendanceRepository;
import com.example.hrms.service.AttendanceService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.stream.Collectors;
 
@Service
public class AttendanceServiceImpl
        implements AttendanceService {
 
    @Autowired
    private AttendanceRepository attendanceRepository;
 
    @Override
    public AttendanceDTO markAttendance(
            AttendanceDTO attendanceDTO) {
 
        Attendance attendance = new Attendance();
 
        attendance.setAttendanceDate(
                attendanceDTO.getAttendanceDate());
 
        attendance.setStatus(
                attendanceDTO.getStatus());
 
        Attendance savedAttendance =
                attendanceRepository.save(attendance);
 
        return new AttendanceDTO(
                savedAttendance.getId(),
                savedAttendance.getAttendanceDate(),
                savedAttendance.getStatus()
        );
    }
 
    @Override
    public List<AttendanceDTO> getAllAttendance() {
 
        return attendanceRepository.findAll()
                .stream()
                .map(attendance ->
                        new AttendanceDTO(
                                attendance.getId(),
                                attendance.getAttendanceDate(),
                                attendance.getStatus()
                        )
                ).collect(Collectors.toList());
    }
 
    @Override
    public AttendanceDTO getAttendanceById(Long id) {
 
        Attendance attendance =
                attendanceRepository.findById(id)
                        .orElse(null);
 
        return new AttendanceDTO(
                attendance.getId(),
                attendance.getAttendanceDate(),
                attendance.getStatus()
        );
    }
 
    @Override
    public AttendanceDTO updateAttendance(
            Long id,
            AttendanceDTO attendanceDTO) {
 
        Attendance attendance =
                attendanceRepository.findById(id)
                        .orElse(null);
 
        attendance.setAttendanceDate(
                attendanceDTO.getAttendanceDate());
 
        attendance.setStatus(
                attendanceDTO.getStatus());
 
        Attendance updatedAttendance =
                attendanceRepository.save(attendance);
 
        return new AttendanceDTO(
                updatedAttendance.getId(),
                updatedAttendance.getAttendanceDate(),
                updatedAttendance.getStatus()
        );
    }
 
    @Override
    public void deleteAttendance(Long id) {
 
        attendanceRepository.deleteById(id);
    }
}
 