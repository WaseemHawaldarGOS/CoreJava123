package com.gos.spring.spring1dot2aop.afteradvice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{
	
	@Override
	public void afterReturning(Object return_value, Method m, Object[] arg0, Object target) throws Throwable {
		
		System.out.println("Inside After returning ThrowsAdvice");
		System.out.println("return value is "+return_value);
		System.out.println("Number of arguments in target method are "+arg0.length);
		System.out.println("target class name is "+target.getClass());
	}
}
