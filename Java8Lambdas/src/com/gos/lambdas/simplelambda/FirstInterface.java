package com.gos.lambdas.simplelambda;


/**
 * Any interface having single abstract method is called as functional interface.
 * Adding @FunctionalInterface as annotation is optional.
 * 
 * @FunctionalInterface annotation can be used to explicitly specify that a given interface is to be treated as a functional interface. 
 * Then the compiler would check and give a compile-time error in case the annotated interface does not satisfy 
 * the basic condition of qualifying as a functional interface(that of having a single abstract method). 
 * 
 * @author whawalda
 *
 */

/*
https://www.javabrahman.com/java-8
 */

@FunctionalInterface
public interface FirstInterface {
	
	public void getData(String param);

}
