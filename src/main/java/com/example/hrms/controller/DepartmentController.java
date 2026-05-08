package com.example.hrms.controller;
 
import com.example.hrms.entity.Department;
import com.example.hrms.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {
 
    @Autowired
    private DepartmentRepository departmentRepository;
 
    // Add Department
    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
 
        return departmentRepository.save(department);
    }
 
    // Get All Departments
    @GetMapping
    public List<Department> getAllDepartments() {
 
        return departmentRepository.findAll();
    }
 
    // Get Department By ID
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
 
        return departmentRepository.findById(id).orElse(null);
    }
 
    // Update Department
    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long id,
                                       @RequestBody Department department) {
 
        Department existingDepartment =
                departmentRepository.findById(id).orElse(null);
 
        existingDepartment.setDepartmentName(
                department.getDepartmentName());
 
        return departmentRepository.save(existingDepartment);
    }
 
    // Delete Department
    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id) {
 
        departmentRepository.deleteById(id);
 
        return "Department Deleted Successfully";
    }
}
 