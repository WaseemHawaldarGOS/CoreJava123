package com.gos.spring.schemabasedadvices.afteradvice;

public class AfterTarget {

	public String MyBusiness(int id) throws Exception{
		
		System.out.println("Inside MyBusiness: ");
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
	public String MyProgram(int id) throws Exception{
		
		System.out.println("Inside MyProgram: ");
		if(id == 0){
			System.out.println("inside test1 of MyProgram. .");
			System.out.println("returning test1 of MyProgram . .");
			return "test1 of MyProgram";
		}
		else if(id == 1){
			System.out.println("inside test2 of MyProgram");
			System.out.println("returning test2  of MyProgram. .");
			return "test2 of MyProgram";
		}
		else{
			System.out.println("Inside general test of MyProgram");
			System.out.println("returning general test of MyProgram . .");
			return "general test of MyProgram";
		}
		
	}
}
