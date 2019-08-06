package com.uid.model;

import java.io.Serializable;

public class Enroll implements Comparable<Enroll>, Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int contactNo;
	private String look;
	
	
	

	public Enroll(String name, int contactNo, String look) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.look = look;
	}


	public Enroll() {
		super();
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




	@Override
	public String toString() {
		return "Enroll [name=" + name + ", contactNo=" + contactNo + ", look="
				+ look + "]";
	}


	@Override
	public int compareTo(Enroll o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
