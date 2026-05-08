package com.example.hrms.util;
 
public class PayrollCalculator {
 
    // Calculate Net Salary
    public static Double calculateNetSalary(
            Double basicSalary,
            Double bonus,
            Double deductions) {
 
        return basicSalary + bonus - deductions;
    }
 
    // Calculate Annual Salary
    public static Double calculateAnnualSalary(
            Double monthlySalary) {
 
        return monthlySalary * 12;
    }
 
    // Calculate Bonus Percentage
    public static Double calculateBonus(
            Double salary,
            Double percentage) {
 
        return (salary * percentage) / 100;
    }
}
 