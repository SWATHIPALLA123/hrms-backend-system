package com.example.hrms.service;
 
import com.example.hrms.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
 
    EmployeeDTO addEmployee(EmployeeDTO employeeDTO);
 
    List<EmployeeDTO> getAllEmployees();
 
    EmployeeDTO getEmployeeById(Long id);
 
    EmployeeDTO updateEmployee(Long id, EmployeeDTO employeeDTO);
 
    void deleteEmployee(Long id);
}
 