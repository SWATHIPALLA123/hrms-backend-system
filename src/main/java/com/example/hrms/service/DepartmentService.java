package com.example.hrms.service;
 
import com.example.hrms.dto.DepartmentDTO;
 
import java.util.List;
 
public interface DepartmentService {
 
    DepartmentDTO addDepartment(
            DepartmentDTO departmentDTO);
 
    List<DepartmentDTO> getAllDepartments();
 
    DepartmentDTO getDepartmentById(Long id);
 
    DepartmentDTO updateDepartment(
            Long id,
            DepartmentDTO departmentDTO);
 
    void deleteDepartment(Long id);
}
 