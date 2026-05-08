package com.example.hrms.exception;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
 
@RestControllerAdvice
public class GlobalExceptionHandler {
 
    // Handle Resource Not Found Exception
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(
            ResourceNotFoundException ex) {
 
        return new ResponseEntity<>(
                ex.getMessage(),
                HttpStatus.NOT_FOUND
        );
    }
 
    // Handle Duplicate Employee Exception
    @ExceptionHandler(DuplicateEmployeeException.class)
    public ResponseEntity<String> handleDuplicateEmployeeException(
            DuplicateEmployeeException ex) {
 
        return new ResponseEntity<>(
                ex.getMessage(),
                HttpStatus.CONFLICT
        );
    }
 
    // Handle Global Exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(
            Exception ex) {
 
        return new ResponseEntity<>(
                ex.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
 