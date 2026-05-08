# HRMS Backend System
 
## Project Overview
HRMS (Human Resource Management System) Backend Application developed using Spring Boot and MySQL.
 
This project manages:
 
- Employees
- Departments
- Attendance
- Leave Management
- Payroll
- Authentication
 
---
 
## Technologies Used
 
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Swagger/OpenAPI
- JWT Authentication
- Lombok
 
---
 
## Project Structure
 
```text
controller  -> Handles API requests
service     -> Business logic
repository  -> Database operations
entity      -> Database tables
dto         -> Data transfer objects
security    -> JWT & Spring Security
config      -> Configuration classes
```
 
---
 
## Features
 
### Employee Management
- Create Employee
- Get Employee
- Update Employee
- Delete Employee
 
### Department Management
- Add Department
- View Departments
 
### Attendance Management
- Mark Attendance
- Get Attendance
 
### Leave Management
- Apply Leave
- Approve Leave
- Reject Leave
 
### Payroll Management
- Generate Payroll
- Get Payroll Details
 
### Authentication
- Login API
- JWT Token Generation
 
---
 
## Swagger URL
 
```text
http://localhost:8080/swagger-ui/index.html
```
 
---
 
## API Endpoints
 
### Employee APIs
 
| Method | Endpoint |
|--------|----------|
| POST | /api/v1/employees |
| GET | /api/v1/employees |
| GET | /api/v1/employees/{id} |
| PUT | /api/v1/employees/{id} |
| DELETE | /api/v1/employees/{id} |
 
---
 
### Department APIs
 
| Method | Endpoint |
|--------|----------|
| POST | /api/v1/departments |
| GET | /api/v1/departments |
 
---
 
### Attendance APIs
 
| Method | Endpoint |
|--------|----------|
| POST | /api/v1/attendance |
| GET | /api/v1/attendance |
 
---
 
### Leave APIs
 
| Method | Endpoint |
|--------|----------|
| POST | /api/v1/leaves |
| PUT | /api/v1/leaves/{id}/approve |
| PUT | /api/v1/leaves/{id}/reject |
 
---
 
### Payroll APIs
 
| Method | Endpoint |
|--------|----------|
| POST | /api/v1/payroll |
| GET | /api/v1/payroll |
 
---
 
## Database Configuration
 
Update application.properties:
 
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hrms_db
spring.datasource.username=root
spring.datasource.password=your_password
```
 
---
 
## How To Run
 
1. Start MySQL Server
2. Create Database:
 
```sql
CREATE DATABASE hrms_db;
```
 
3. Run Spring Boot Application
4. Open Swagger UI
5. Test APIs
 
---
 
## Author
 
Swathi Palla
 
