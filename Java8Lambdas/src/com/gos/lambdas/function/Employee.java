package com.gos.lambdas.function;


/*
https://www.javabrahman.com/java-8
 */
public class Employee {
	
	private int employeeId;
	
	private String name;
	
	public Employee(String name, int employeeId) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}

	public Employee(int employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}

	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}
	
	

}
