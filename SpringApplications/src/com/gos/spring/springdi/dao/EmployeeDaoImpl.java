package com.gos.spring.springdi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class EmployeeDaoImpl implements EmployeeDAO {
	
	public DataSource dataSource;
	
	public EmployeeDaoImpl(DataSource ds){
		dataSource = ds;
	}

	@Override
	public double getSalary(int empno) {
		Connection conn = null;

		double salary = 0;
		try {
			conn = dataSource.getConnection();
		
		PreparedStatement ps = conn.prepareStatement("select salary from employee where empno = ?");
		ps.setDouble(1, empno);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			salary = rs.getDouble(1);
		}
		} catch (SQLException e) {
			System.out.println("Exception occured in getSalary method "+e.getMessage());
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Exception occured in getSalary method while trying to close the connection "+e.getMessage());
				e.printStackTrace();
			}
		}
		return salary;
		
	
	}

	@Override
	public void setSalary(int empno, double updatedsalary) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		
		PreparedStatement ps = conn.prepareStatement("update employee set salary = ? where empno = ?");
		ps.setDouble(1, updatedsalary);
		ps.setInt(2, empno);
		int result = ps.executeUpdate();
		if(result == 1){
			System.out.println("New salary has been updated successfully");
		}
		else{
			System.out.println("Could not update the salary");
		}
		} catch (SQLException e) {
			System.out.println("Exception occured in setSalary method "+e.getMessage());
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Exception occured in setSalary method while trying to close the connection "+e.getMessage());
				e.printStackTrace();
			}
		}
		
		
	}

}
