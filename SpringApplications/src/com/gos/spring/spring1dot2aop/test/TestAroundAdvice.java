/**
 * 
 */
package com.gos.spring.spring1dot2aop.test;

import com.gos.spring.spring1dot2aop.target.Target;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author M1012783
 *
 */
public class TestAroundAdvice {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {

		//below line works in eclipse but not in intellij
		//BeanFactory beans = new XmlBeanFactory(new FileSystemResource("file:src/com/gos/spring/spring1dot2aop/beforeadvice/mybeans.xml"));

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf/mybeans.xml");

		/*
		To test around advice
		*/
		Target proxyBean = (Target) applicationContext.getBean("proxyBeanAroundAdvice");
		
		System.out.println("From main, calling MyBusiness(0)");
		Object obj1 = proxyBean.targetMethod(0);
		System.out.println("Back to main or client, return value is "+obj1.toString());
		System.out.println("*********************************************************************");
		
		System.out.println("From main, calling MyBusiness(1)");
		Object obj2 = proxyBean.targetMethod(1);
		System.out.println("Back to main or client, return value is "+obj2.toString());
		System.out.println("*********************************************************************");
		
		System.out.println("From main, calling MyBusiness(5)");
		Object obj3 = proxyBean.targetMethod(5);
		System.out.println("Back to main or client, return value is "+obj3.toString());
		System.out.println("*********************************************************************");

	}

}
