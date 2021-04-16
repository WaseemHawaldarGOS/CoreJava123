package com.gos.spring.spring1dot2aop.throwsadvice;
import java.sql.SQLException;

public class ThrowsAdvice implements org.springframework.aop.ThrowsAdvice {
	
	public void afterThrowing(SQLException sqe) throws Throwable{		
		System.out.println("Caught SQLException in AfterThrowing ThrowsAdvice");
		System.out.println("Error Message is "+sqe.getMessage());
	}
	
	public void afterThrowing(MyExceptions1 m1) throws Throwable{		
		System.out.println("Caught MyExceptions1 in AfterThrowing ThrowsAdvice");
		System.out.println("Error Message is "+m1.getMessage());
	}
	
	public void afterThrowing(MyExceptions2 m2) throws Throwable{		
		System.out.println("Caught MyExceptions2 in AfterThrowing ThrowsAdvice");
		System.out.println("Error Message is "+m2.getMessage());
	}
}
