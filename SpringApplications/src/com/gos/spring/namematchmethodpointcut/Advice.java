package com.gos.spring.namematchmethodpointcut;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Advice implements MethodBeforeAdvice{

	@Override
	public void before(Method m, Object[] args, Object target) throws Throwable {
		
		System.out.println("Inside method before advice:");
		
		System.out.println("This advice is being applied for method :"+m.getName());
		System.out.println("The number of arguments in target clas are "+args.length);
		System.out.println("Target object is: "+target.getClass());
		
	}

}
