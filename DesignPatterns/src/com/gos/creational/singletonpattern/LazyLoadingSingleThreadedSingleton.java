package com.gos.creational.singletonpattern;

/**
 * 
 * @author WHWL
 * This type of singleton object creation should be used only in case of 
 * single-threaded applications
 *
 */


public class LazyLoadingSingleThreadedSingleton {
	
	private static LazyLoadingSingleThreadedSingleton instance;
	private String instanceName = "DefaultInstance";
	
	private LazyLoadingSingleThreadedSingleton(){
		
	}
	
	public static LazyLoadingSingleThreadedSingleton getInstance(){
		
		if(instance == null){
			instance = new LazyLoadingSingleThreadedSingleton();
		}
		
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
