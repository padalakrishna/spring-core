package com.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.classicmodels.dao.ClassicModelsDao;
import com.java.classicmodels.dao.ClassicModelsDaoImpl;
import com.java.classicmodels.service.EmployeeService;
import com.java.classicmodels.service.EmployeeServiceImpl;
import com.java.classicmodels.service.StudentService;
import com.java.classicmodels.service.StudentServiceImpl;

@Configuration
//@ComponentScan({"com.java.classicmodels.service", "com.java.classicmodels.dao"}) // Need to provide Packages Names
public class ClassicModelsConfiguration {
	
	@Bean(name = "classicmodelsDao")
	public ClassicModelsDao classicModelsDao() {
		return new ClassicModelsDaoImpl();
	}
	
	@Bean(name = "employeeService")
	public EmployeeService empService() {
		return new EmployeeServiceImpl();
	}
	
	@Bean(name = "studentService")
	public StudentService studentService() {
		return new StudentServiceImpl();
	}
}
