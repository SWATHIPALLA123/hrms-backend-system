package com.example.hrms.controller;
 
import com.example.hrms.dto.EmployeeDTO;
import com.example.hrms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
 
    @Autowired
    private EmployeeService employeeService;
 
    // Add Employee
    @PostMapping
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO) {
 
        return employeeService.addEmployee(employeeDTO);
    }
 
    // Get All Employees
    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
 
        return employeeService.getAllEmployees();
    }
 
    // Get Employee By ID
    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id) {
 
        return employeeService.getEmployeeById(id);
    }
 
    // Update Employee
    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable Long id,
                                      @RequestBody EmployeeDTO employeeDTO) {
 
        return employeeService.updateEmployee(id, employeeDTO);
    }
 
    // Delete Employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
 
        employeeService.deleteEmployee(id);
 
        return "Employee Deleted Successfully";
    }
}
 