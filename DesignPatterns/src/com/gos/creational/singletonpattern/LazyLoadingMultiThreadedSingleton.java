package com.gos.creational.singletonpattern;

/**
 * 
 * @author WHWL
 * 
 * This kind of singleton object creation should be used in case of multi-threaded 
 * application and that to were performance is not an issue. Or were creating instance 
 * thing is not being done at many parts of the application.
 */


public class LazyLoadingMultiThreadedSingleton {
	
	private static LazyLoadingMultiThreadedSingleton instance ;
	
	private LazyLoadingMultiThreadedSingleton(){
		
	}
	
	public static synchronized LazyLoadingMultiThreadedSingleton getInstance(){
		
		if(instance == null){
			instance = new LazyLoadingMultiThreadedSingleton();
		}
		
		return instance;
	}

}
