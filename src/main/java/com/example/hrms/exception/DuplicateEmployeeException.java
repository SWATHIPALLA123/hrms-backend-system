package com.example.hrms.exception;
 
public class DuplicateEmployeeException extends RuntimeException {
 
    public DuplicateEmployeeException(String message) {
 
        super(message);
    }
}
 