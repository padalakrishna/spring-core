package com.java.classicmodels.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.classicmodels.dao.ClassicModelsDao;
import com.java.classicmodels.entity.Employee;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	//private ClassicModelsDao dao = new ClassicModelsDaoImpl();
	
	@Autowired
	private ClassicModelsDao dao;
	
	
	public Employee getEmployee(int id) {
		return dao.getEmployee(id);
	}
}
