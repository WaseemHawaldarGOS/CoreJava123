package com.uid.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.uid.exception.DaoException;
import com.uid.model.Admin;
import com.uid.model.Enroll;
import com.uid.model.Report;

public class UIDDaoImpl extends BaseDao implements UIDDao {

	private static final String enrolQuery = "insert into hr.enroll(enroll_id,name,CONTACT_NO,look) values(uid_seq.nextval, ?,?,?)";
	private static final String uidQuery = "select uid from hr.enroll";
	private static final String adminQuery = "delete from hr.admin where uid = ?";
	private static final String reportQuery = "select uid,name,CONTACT_NO,look from enroll e, admin a where e.uid = a.uid";
	private static Connection con;
	
	public UIDDaoImpl() throws DaoException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object Enrollment(Enroll enroll) throws DaoException {
		PreparedStatement psmt = null;
		try {
			con = getConnection();
			psmt = con.prepareStatement(enrolQuery);
			psmt.setString(1, enroll.getName());
			psmt.setLong(2, enroll.getCONTACT_NO());
			psmt.setString(3, enroll.getLook());
			psmt.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(),e);
		}
		finally{
			releaseResource(null, psmt, con);
		}
		
		return null;
	}

	@Override
	public Object listOfUIDs() throws DaoException {
		Statement stmt = null;
		ResultSet rs = null;
		List<Report> listOfUids = new ArrayList<Report>();
		con = getConnection();
		try {
			 stmt = con.createStatement();
			 rs = stmt.executeQuery(uidQuery);
			while(rs.next()){
				Report report = new Report();
				report.setUid(rs.getInt(1));
				listOfUids.add(report);
			}
			
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(),e);
		}
		finally{
			releaseResource(rs, stmt, con);
		}
		return listOfUids;
		
	}

	@Override
	public Object Administration(Admin admin) throws DaoException {
		PreparedStatement psmt = null;
		try {
			con = getConnection();
			psmt = con.prepareStatement(adminQuery);
			psmt.setInt(1, admin.getUid());
			psmt.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(),e);
		}
		finally{
			releaseResource(null, psmt, con);
		}
		
		return null;
	}

	@Override
	public Object ViewReport() throws DaoException {
		Statement stmt = null;
		ResultSet rs = null;
		List<Report> listOfReports = new ArrayList<Report>();
		con = getConnection();
		try {
			 stmt = con.createStatement();
			 rs = stmt.executeQuery(uidQuery);
			while(rs.next()){
				Report report1 = new Report();
				report1.setUid(rs.getInt(1));
				report1.setName(rs.getString(2));
				report1.setCONTACT_NO(rs.getInt(3));
				report1.setLook(rs.getString(4));
				listOfReports.add(report1);
			}
			
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(),e);
		}
		finally{
			releaseResource(rs, stmt, con);
		}
		return listOfReports;
	}

}
