package com.gos.creational.singletonpattern;

/**
 * 
 * @author WHWL
 * This type of singleton object creation should be used only in case of 
 * single-threaded applications
 *
 */


public class LazyLoadingSingleThreadedSingletonFailureCase {

	private static LazyLoadingSingleThreadedSingletonFailureCase instance;
	private String instanceName = "DefaultInstance";

	private LazyLoadingSingleThreadedSingletonFailureCase(){
		
	}
	
	public static LazyLoadingSingleThreadedSingletonFailureCase getInstance(){
		instance = new LazyLoadingSingleThreadedSingletonFailureCase();
		return instance;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}


	//Other useful methods here

}
