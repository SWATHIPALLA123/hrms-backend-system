package com.example.hrms.service.impl;
 
import com.example.hrms.dto.EmployeeDTO;
import com.example.hrms.entity.Employee;
import com.example.hrms.exception.ResourceNotFoundException;
import com.example.hrms.repository.EmployeeRepository;
import com.example.hrms.service.EmployeeService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.stream.Collectors;
 
@Service
public class EmployeeServiceImpl
        implements EmployeeService {
 
    @Autowired
    private EmployeeRepository employeeRepository;
 
    @Override
    public EmployeeDTO addEmployee(
            EmployeeDTO employeeDTO) {
 
        Employee employee = new Employee();
 
        employee.setFirstName(
                employeeDTO.getFirstName());
 
        employee.setLastName(
                employeeDTO.getLastName());
 
        employee.setEmail(
                employeeDTO.getEmail());
 
        employee.setSalary(
                employeeDTO.getSalary());
 
        Employee savedEmployee =
                employeeRepository.save(employee);
 
        return new EmployeeDTO(
                savedEmployee.getId(),
                savedEmployee.getFirstName(),
                savedEmployee.getLastName(),
                savedEmployee.getEmail(),
                savedEmployee.getSalary()
        );
    }
 
    @Override
    public List<EmployeeDTO> getAllEmployees() {
 
        return employeeRepository.findAll()
                .stream()
                .map(employee ->
                        new EmployeeDTO(
                                employee.getId(),
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getEmail(),
                                employee.getSalary()
                        )
                ).collect(Collectors.toList());
    }
 
    @Override
    public EmployeeDTO getEmployeeById(Long id) {
 
        Employee employee =
                employeeRepository.findById(id)
 
                        .orElseThrow(() ->
                                new ResourceNotFoundException(
                                        "Employee Not Found"));
 
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getSalary()
        );
    }
 
    @Override
    public EmployeeDTO updateEmployee(
            Long id,
            EmployeeDTO employeeDTO) {
 
        Employee employee =
                employeeRepository.findById(id)
 
                        .orElseThrow(() ->
                                new ResourceNotFoundException(
                                        "Employee Not Found"));
 
        employee.setFirstName(
                employeeDTO.getFirstName());
 
        employee.setLastName(
                employeeDTO.getLastName());
 
        employee.setEmail(
                employeeDTO.getEmail());
 
        employee.setSalary(
                employeeDTO.getSalary());
 
        Employee updatedEmployee =
                employeeRepository.save(employee);
 
        return new EmployeeDTO(
                updatedEmployee.getId(),
                updatedEmployee.getFirstName(),
                updatedEmployee.getLastName(),
                updatedEmployee.getEmail(),
                updatedEmployee.getSalary()
        );
    }
 
    @Override
    public void deleteEmployee(Long id) {
 
        Employee employee =
                employeeRepository.findById(id)
 
                        .orElseThrow(() ->
                                new ResourceNotFoundException(
                                        "Employee Not Found"));
 
        employeeRepository.delete(employee);
    }
}
 