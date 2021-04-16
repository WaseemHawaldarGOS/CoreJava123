package com.gos.creational.singletonpattern;

/**
 * 
 * @author WHWL
 * 
 * This kind of singleton object creation should be used in case of multi-threaded 
 * application and that to were performance is an issue. Or were creating instance 
 * thing is being done at many parts of the application.
 * 
 * With double checked locking, we first check to see if an instance is created, 
 * and if not , THEN we synchronize. This way, we only synchronize the first time through, just what we want. 
 * 
 * The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly when it is 
 * being initialized to the singleton instance.  
 * 
 *  */


public class DoubleCheckedLockingMultiThreadedSingleton {
	
	private static volatile DoubleCheckedLockingMultiThreadedSingleton instance;
	
	private DoubleCheckedLockingMultiThreadedSingleton(){
		
	}

	/*
	Every time creating a lock on object using synchronized keyword is expensive so we check null first and then synchronize it.
	 */
	public static DoubleCheckedLockingMultiThreadedSingleton getInstance(){
		
		if(instance == null){
			synchronized(DoubleCheckedLockingMultiThreadedSingleton.class){
				if(instance == null){
					instance = new DoubleCheckedLockingMultiThreadedSingleton();
				}
			}
		}
		return instance;
	}

}
