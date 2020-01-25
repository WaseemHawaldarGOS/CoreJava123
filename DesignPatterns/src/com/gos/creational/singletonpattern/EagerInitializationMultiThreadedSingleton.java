package com.gos.creational.singletonpattern;

/**
 * 
 * @author WHWL
 * 
 * This kind of singleton object creation should be used in case of multi-threaded 
 * application and that to were performance is an issue. Or were creating instance 
 * thing is being done at many parts of the application.
 * 
 * Using this approach, we rely on the JVM to create the unique instance of singleton 
 * when the class is loaded. The JVM guarantees that the instance will be created before 
 * any thread accesses the static unique instance variable.
 */


public class EagerInitializationMultiThreadedSingleton {
	
	private static EagerInitializationMultiThreadedSingleton instance = new EagerInitializationMultiThreadedSingleton();

	/*
	Private constructor has been added to stop any outsider from creating new instance using default constructor.
	 */
	private EagerInitializationMultiThreadedSingleton(){
		
	}
	
	public static synchronized EagerInitializationMultiThreadedSingleton getInstance(){
		return instance;
	}

}
