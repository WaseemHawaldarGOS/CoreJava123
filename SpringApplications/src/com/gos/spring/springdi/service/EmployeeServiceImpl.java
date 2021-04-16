package com.gos.spring.springdi.service;


import com.gos.spring.springdi.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDao;
	public EmployeeDAO getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void incrementSalary(int empNo, double amt) {
		double InitialSalary = this.getEmployeeDao().getSalary(empNo);
		double updatedSalary = InitialSalary+amt;
		employeeDao.setSalary(empNo, updatedSalary);
	}
}
