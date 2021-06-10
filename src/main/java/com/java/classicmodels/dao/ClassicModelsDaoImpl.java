package com.java.classicmodels.dao;

import org.springframework.stereotype.Repository;

import com.java.classicmodels.entity.Employee;
import com.java.classicmodels.entity.Student;

@Repository
public class ClassicModelsDaoImpl implements ClassicModelsDao {

	@Override
	public Employee getEmployee(int empId) {
		
		// Assume that we are fetching this object from DB
		// Employee e = session.get(Employee.class, id);
		return new Employee(empId, "krishna prasad", "PNC", "9191919191");
	}

	@Override
	public Student getStudent(int sid) {
		return new Student(sid, "Pankaj", "credits", "9292929292");
	}
}
