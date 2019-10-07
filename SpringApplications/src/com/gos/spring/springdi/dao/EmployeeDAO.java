package com.gos.spring.springdi.dao;

public interface EmployeeDAO {

	public double getSalary(int empno);
	
	public void setSalary(int empno, double updatedsalary);
	
}
