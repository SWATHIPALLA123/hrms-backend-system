package com.example.hrms.service;
 
import com.example.hrms.dto.PayrollDTO;
 
import java.util.List;
 
public interface PayrollService {
 
    PayrollDTO createPayroll(
            PayrollDTO payrollDTO);
 
    List<PayrollDTO> getAllPayrolls();
 
    PayrollDTO getPayrollById(Long id);
 
    PayrollDTO updatePayroll(
            Long id,
            PayrollDTO payrollDTO);
 
    void deletePayroll(Long id);
}