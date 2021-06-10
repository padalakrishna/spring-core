package com.java.spring.app;

import com.java.classicmodels.entity.Employee;
import com.java.classicmodels.entity.Student;
import com.java.classicmodels.service.EmployeeService;
import com.java.classicmodels.service.EmployeeServiceImpl;
import com.java.classicmodels.service.StudentService;
import com.java.classicmodels.service.StudentServiceImpl;

// Assume this Controller Class
public class App 
{
	StudentService studentService = new StudentServiceImpl();
	EmployeeService employeeService = new EmployeeServiceImpl();
	
    public static void main( String[] args )
    {
    	App app = new App();
  
    	// Fetching student from DB
        Student s = app.getStudent(12);
        Employee e = app.getEmployee(15);
        
        System.out.println("Student is "+s.toString());
        System.out.println("Employee is "+e.toString());
    }
    
    private Employee getEmployee(int id) {
    	return employeeService.getEmployee(id);
    }
    
    private Student getStudent(int id) {
    	return studentService.getStudent(id);
    }
}
