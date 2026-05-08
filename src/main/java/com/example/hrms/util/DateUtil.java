package com.example.hrms.util;
 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 
public class DateUtil {
 
    // Get Current Date
    public static LocalDate getCurrentDate() {
 
        return LocalDate.now();
    }
 
    // Format Date
    public static String formatDate(LocalDate date) {
 
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");
 
        return date.format(formatter);
    }
 
    // Parse String To Date
    public static LocalDate parseDate(String date) {
 
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");
 
        return LocalDate.parse(date, formatter);
    }
}
 