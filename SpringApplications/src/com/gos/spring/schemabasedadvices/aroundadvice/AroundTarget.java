package com.gos.spring.schemabasedadvices.aroundadvice;

public class AroundTarget {
	
		public String MyMethod(int id){
			System.out.println("Inside MyMethod of AroundTarget");
			
			if(id == 0){
				System.out.println("Returning 0");
				return "zero";
				
			}
			else if(id == 1){
				System.out.println("Returning 1");
				return "one";
				
			}
			else if(id == 2){
				System.out.println("Returning 2");
				return "two";
				
			}
			else{
				System.out.println("Returning general");
				return "general";
			}
			
			
		}

}
