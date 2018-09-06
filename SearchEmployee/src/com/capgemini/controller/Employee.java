package com.capgemini.controller;

public class Employee {
	private String name ;
	private String departmentName ;
	private long empId ;
	private double salary ;
	
	public Employee(String name, String departmentName, long empId, double salary) {
		super();
		this.name = name;
		this.departmentName = departmentName;
		this.empId = empId;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
