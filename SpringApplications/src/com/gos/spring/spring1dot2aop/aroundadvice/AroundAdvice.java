package com.gos.spring.spring1dot2aop.aroundadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("Inside invoke method of MethodInterceptor");
		System.out.println("Before calling proceed");
		Object obj = mi.proceed();
		System.out.println("After calling proceed return value is "+obj.toString());		
		return obj;
	}

}
