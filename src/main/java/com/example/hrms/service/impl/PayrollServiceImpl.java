package com.example.hrms.service.impl;
 
import com.example.hrms.dto.PayrollDTO;
import com.example.hrms.entity.Payroll;
import com.example.hrms.repository.PayrollRepository;
import com.example.hrms.service.PayrollService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.stream.Collectors;
 
@Service
public class PayrollServiceImpl
        implements PayrollService {
 
    @Autowired
    private PayrollRepository payrollRepository;
 
    @Override
    public PayrollDTO createPayroll(
            PayrollDTO payrollDTO) {
 
        Payroll payroll = new Payroll();
 
        payroll.setBasicSalary(
                payrollDTO.getBasicSalary());
 
        payroll.setBonus(
                payrollDTO.getBonus());
 
        payroll.setDeductions(
                payrollDTO.getDeductions());
 
        payroll.setNetSalary(
                payrollDTO.getNetSalary());
 
        Payroll savedPayroll =
                payrollRepository.save(payroll);
 
        return new PayrollDTO(
                savedPayroll.getId(),
                savedPayroll.getBasicSalary(),
                savedPayroll.getBonus(),
                savedPayroll.getDeductions(),
                savedPayroll.getNetSalary()
        );
    }
 
    @Override
    public List<PayrollDTO> getAllPayrolls() {
 
        return payrollRepository.findAll()
                .stream()
                .map(payroll ->
                        new PayrollDTO(
                                payroll.getId(),
                                payroll.getBasicSalary(),
                                payroll.getBonus(),
                                payroll.getDeductions(),
                                payroll.getNetSalary()
                        )
                ).collect(Collectors.toList());
    }
 
    @Override
    public PayrollDTO getPayrollById(Long id) {
 
        Payroll payroll =
                payrollRepository.findById(id)
                        .orElse(null);
 
        return new PayrollDTO(
                payroll.getId(),
                payroll.getBasicSalary(),
                payroll.getBonus(),
                payroll.getDeductions(),
                payroll.getNetSalary()
        );
    }
 
    @Override
    public PayrollDTO updatePayroll(
            Long id,
            PayrollDTO payrollDTO) {
 
        Payroll payroll =
                payrollRepository.findById(id)
                        .orElse(null);
 
        payroll.setBasicSalary(
                payrollDTO.getBasicSalary());
 
        payroll.setBonus(
                payrollDTO.getBonus());
 
        payroll.setDeductions(
                payrollDTO.getDeductions());
 
        payroll.setNetSalary(
                payrollDTO.getNetSalary());
 
        Payroll updatedPayroll =
                payrollRepository.save(payroll);
 
        return new PayrollDTO(
                updatedPayroll.getId(),
                updatedPayroll.getBasicSalary(),
                updatedPayroll.getBonus(),
                updatedPayroll.getDeductions(),
                updatedPayroll.getNetSalary()
        );
    }
 
    @Override
    public void deletePayroll(Long id) {
 
        payrollRepository.deleteById(id);
    }
}
 