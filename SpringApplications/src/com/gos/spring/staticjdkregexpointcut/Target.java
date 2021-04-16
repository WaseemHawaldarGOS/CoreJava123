package com.gos.spring.staticjdkregexpointcut;

public class Target {

	public String Mylogic(int id) throws Exception{
		
		System.out.println("Inside Mylogic: ");
		if(id == 0){
			System.out.println("inside test1 . .");
			System.out.println("returning test1 . .");
			return "test1 ";
		}
		
		else{
			System.out.println("Inside general test");
			System.out.println("returning general test . .");
			return "general test ";
		}
		
	}
	
	public String Mylogic2(int id) throws Exception{
		
		System.out.println("Inside Mylogic2: ");
		if(id == 0){
			System.out.println("inside test1 . .");
			System.out.println("returning test1 . .");
			return "test1 ";
		}
		
		else{
			System.out.println("Inside general test");
			System.out.println("returning general test . .");
			return "general test ";
		}
		
	}

	public String NewMylogic3(int id) throws Exception{
	
	System.out.println("Inside NewMylogic3: ");
	if(id == 0){
		System.out.println("inside test1 . .");
		System.out.println("returning test1 . .");
		return "test1 ";
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
		
		else{
			System.out.println("Inside general test of MyProgram");
			System.out.println("returning general test of MyProgram . .");
			return "general test of MyProgram";
		}
		
	}
	
	public String MyProgram2(int id) throws Exception{
		
		System.out.println("Inside MyProgram2: ");
		if(id == 0){
			System.out.println("inside test1 of MyProgram2. .");
			System.out.println("returning test1 of MyProgram2 . .");
			return "test1 of MyProgram2";
		}
		
		else{
			System.out.println("Inside general test of MyProgram2");
			System.out.println("returning general test of MyProgram2 . .");
			return "general test of MyProgram2";
		}
		
	}


	public String NewMyProgram3(int id) throws Exception{
	
	System.out.println("Inside MyProgram3: ");
	if(id == 0){
		System.out.println("inside test1 of MyProgram3. .");
		System.out.println("returning test1 of MyProgram3 . .");
		return "test1 of MyProgram3";
	}
	
	else{
		System.out.println("Inside general test of MyProgram3");
		System.out.println("returning general test of MyProgram3 . .");
		return "general test of MyProgram3";
	}
	
}
}
