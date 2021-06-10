package com.java.classicmodels.entity;

public class Student {
	
	private int sId;
	private String name;
	private String dept;
	private String number;
	
	public Student(int sId, String name, String dept, String number) {
		super();
		this.sId = sId;
		this.name = name;
		this.dept = dept;
		this.number = number;
	}

	public int getsId() {
		return sId;
	}



	public void setsId(int sId) {
		this.sId = sId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return "studentId:"+sId+" department:"+dept+" name:"+name+" mobileNumber:"+number;
	}
}
