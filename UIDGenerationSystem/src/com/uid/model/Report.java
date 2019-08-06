package com.uid.model;

import java.io.Serializable;

public class Report implements Comparable<Report>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int uid;
	private String name;
	private int contactNo;
	private String look;

	
	

	@Override
	public String toString() {
		return "Report [uid=" + uid + ", name=" + name + ", contactNo="
				+ contactNo + ", look=" + look + "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getLook() {
		return look;
	}

	public void setLook(String look) {
		this.look = look;
	}

	public Report(int uid, String name, int contactNo, String look) {
		super();
		this.uid = uid;
		this.name = name;
		this.contactNo = contactNo;
		this.look = look;
	}


	public Report() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Report o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
