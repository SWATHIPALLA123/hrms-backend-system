package com.example.hrms.controller;
 
import com.example.hrms.entity.Payroll;
import com.example.hrms.repository.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/api/v1/payroll")
public class PayrollController {
 
    @Autowired
    private PayrollRepository payrollRepository;
 
    // Create Payroll
    @PostMapping
    public Payroll createPayroll(
            @RequestBody Payroll payroll) {
 
        return payrollRepository.save(payroll);
    }
 
    // Get All Payrolls
    @GetMapping
    public List<Payroll> getAllPayrolls() {
 
        return payrollRepository.findAll();
    }
 
    // Get Payroll By ID
    @GetMapping("/{id}")
    public Payroll getPayrollById(@PathVariable Long id) {
 
        return payrollRepository.findById(id).orElse(null);
    }
 
    // Update Payroll
    @PutMapping("/{id}")
    public Payroll updatePayroll(@PathVariable Long id,
                                 @RequestBody Payroll payroll) {
 
        Payroll existingPayroll =
                payrollRepository.findById(id).orElse(null);
 
        existingPayroll.setBasicSalary(
                payroll.getBasicSalary());
 
        existingPayroll.setBonus(
                payroll.getBonus());
 
        existingPayroll.setDeductions(
                payroll.getDeductions());
 
        existingPayroll.setNetSalary(
                payroll.getNetSalary());
 
        return payrollRepository.save(existingPayroll);
    }
 
    // Delete Payroll
    @DeleteMapping("/{id}")
    public String deletePayroll(@PathVariable Long id) {
 
        payrollRepository.deleteById(id);
 
        return "Payroll Deleted Successfully";
    }
}