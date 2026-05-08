package com.example.hrms.service.impl;
 
import com.example.hrms.dto.DepartmentDTO;
import com.example.hrms.entity.Department;
import com.example.hrms.repository.DepartmentRepository;
import com.example.hrms.service.DepartmentService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.stream.Collectors;
 
@Service
public class DepartmentServiceImpl
        implements DepartmentService {
 
    @Autowired
    private DepartmentRepository departmentRepository;
 
    @Override
    public DepartmentDTO addDepartment(
            DepartmentDTO departmentDTO) {
 
        Department department = new Department();
 
        department.setDepartmentName(
                departmentDTO.getDepartmentName());
 
        Department savedDepartment =
                departmentRepository.save(department);
 
        return new DepartmentDTO(
                savedDepartment.getId(),
                savedDepartment.getDepartmentName()
        );
    }
 
    @Override
    public List<DepartmentDTO> getAllDepartments() {
 
        return departmentRepository.findAll()
                .stream()
                .map(department ->
                        new DepartmentDTO(
                                department.getId(),
                                department.getDepartmentName()
                        )
                ).collect(Collectors.toList());
    }
 
    @Override
    public DepartmentDTO getDepartmentById(Long id) {
 
        Department department =
                departmentRepository.findById(id)
                        .orElse(null);
 
        return new DepartmentDTO(
                department.getId(),
                department.getDepartmentName()
        );
    }
 
    @Override
    public DepartmentDTO updateDepartment(
            Long id,
            DepartmentDTO departmentDTO) {
 
        Department department =
                departmentRepository.findById(id)
                        .orElse(null);
 
        department.setDepartmentName(
                departmentDTO.getDepartmentName());
 
        Department updatedDepartment =
                departmentRepository.save(department);
 
        return new DepartmentDTO(
                updatedDepartment.getId(),
                updatedDepartment.getDepartmentName()
        );
    }
 
    @Override
    public void deleteDepartment(Long id) {
 
        departmentRepository.deleteById(id);
    }
}