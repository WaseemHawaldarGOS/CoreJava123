/**
 * 
 */
package com.gos.spring.spring1dot2aop.test;

import com.gos.spring.spring1dot2aop.target.Target;
import com.gos.spring.spring1dot2aop.target.ThrowsAdviceTarget;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author M1012783
 *
 */
public class TestAdvices {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {

		//below line works in eclipse but not in intellij
		//BeanFactory beans = new XmlBeanFactory(new FileSystemResource("file:src/com/gos/spring/spring1dot2aop/beforeadvice/mybeans.xml"));

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf/mybeans.xml");

		/*
		To test before advice
		 */
		Target proxyBean = (Target) applicationContext.getBean("proxyBeanBeforeAdvice");

		/*
		To test after advice
		 */
		//Target proxyBean = (Target) applicationContext.getBean("proxyBeanAfterAdvice");

        /*
		To test throws advice
		 */
        //ThrowsAdviceTarget proxyBean = (ThrowsAdviceTarget) applicationContext.getBean("proxyBeanThrowsAdvice");

		System.out.println("From main, calling targetMethod(0)");
		proxyBean.targetMethod(0);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling targetMethod(1)");
		proxyBean.targetMethod(1);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling targetMethod(5)");
		proxyBean.targetMethod(5);
		System.out.println("*********************************************************");

	}
}
