package com.java.classicmodels.dao;

import com.java.classicmodels.entity.Employee;
import com.java.classicmodels.entity.Student;

public interface ClassicModelsDao {
	
	public Employee getEmployee(int empId);
	
	public Student getStudent(int sid);
	
}
