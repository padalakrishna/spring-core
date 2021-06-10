package com.java.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.java.classicmodels.entity.Employee;
import com.java.classicmodels.entity.Student;
import com.java.classicmodels.service.EmployeeService;
import com.java.classicmodels.service.StudentService;
import com.java.configuration.ClassicModelsConfiguration;

public class AnnotationMain {
	
	
	public static void main (String args[]) {
		
		 AbstractApplicationContext context = new AnnotationConfigApplicationContext(ClassicModelsConfiguration.class);
		 
		 
		 // Fetching the Objects from Tables
		 // This is Example for Autowiring by Name
		 StudentService studentService = (StudentService) context.getBean("studentService"); 
		 EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		 
		 Employee e = employeeService.getEmployee(20);
		 Student s = studentService.getStudent(30);
		 
		 System.out.println("Employee is "+e.toString());
		 System.out.println("Student is"+s.toString());
		 
		 context.close();
		 
		 
	       
	}
}
