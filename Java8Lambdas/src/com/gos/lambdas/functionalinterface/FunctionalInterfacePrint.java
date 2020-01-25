package com.gos.lambdas.functionalinterface;


/*
https://www.javabrahman.com/java-8
 */
public class FunctionalInterfacePrint {
	
	public void print(FirstInterface firstInterface) {
		firstInterface.getData("hello world2");
	}
	
	
	
	public static void main(String[] args) {
		FunctionalInterfacePrint functionalInterfacePrint =  new FunctionalInterfacePrint();
		/*
		 * An instance of a lambda can be assigned to any functional interface
			whose single abstract method�s definition matches the definition of the lambda. 
		 */
		functionalInterfacePrint.print((String param) -> {
			System.out.println("Inside first interface,input received is "+param);
		});
	}

}
