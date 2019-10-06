package com.gos.spring.spring1dot2aop.target;

public class Target {

	public String targetMethod(int id) throws Exception{
		
		System.out.println("Inside targetMethod: ");
		if(id == 0){
			System.out.println("inside test1 . .");
			System.out.println("returning test1 . .");
			return "test1 ";
		}
		else if(id == 1){
			System.out.println("inside test2");
			System.out.println("returning test2 . .");
			return "test2 ";
		}
		else{
			System.out.println("Inside general test");
			System.out.println("returning general test . .");
			return "general test ";
		}
		
	}
}
