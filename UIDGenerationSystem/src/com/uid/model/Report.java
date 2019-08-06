package com.uid.model;

import java.io.Serializable;

public class Report implements Comparable<Report>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int uid;
	private String name;
	private int CONTACT_NO;
	private String look;

	
	

	@Override
	public String toString() {
		return "Report [uid=" + uid + ", name=" + name + ", CONTACT_NO="
				+ CONTACT_NO + ", look=" + look + "]";
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

	public int getCONTACT_NO() {
		return CONTACT_NO;
	}

	public void setCONTACT_NO(int CONTACT_NO) {
		this.CONTACT_NO = CONTACT_NO;
	}

	public String getLook() {
		return look;
	}

	public void setLook(String look) {
		this.look = look;
	}

	public Report(int uid, String name, int CONTACT_NO, String look) {
		super();
		this.uid = uid;
		this.name = name;
		this.CONTACT_NO = CONTACT_NO;
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
