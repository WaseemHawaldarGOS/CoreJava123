package com.gos.spring.schemabasedadvices.aroundadvice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	
	public Object loggingMethod(ProceedingJoinPoint pj) throws Throwable{
		
		System.out.println("Inside Logger advice class");
		System.out.println("Before calling target");
		
		Object obj = pj.proceed();
		
		System.out.println("After the call of target method.");
		System.out.println("Return value found is "+obj);
		return obj;	
		
	}

}
