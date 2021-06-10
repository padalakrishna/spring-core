package com.java.classicmodels.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.classicmodels.dao.ClassicModelsDao;
import com.java.classicmodels.entity.Student;


@Component("studentService")
public class StudentServiceImpl implements StudentService {
	
	//private ClassicModelsDao dao = new ClassicModelsDaoImpl();
	
	// Example for Autowiring by Type 
	@Autowired
	private ClassicModelsDao dao;

	@Override
	public Student getStudent(int id) {
		return dao.getStudent(id);
	}

}
