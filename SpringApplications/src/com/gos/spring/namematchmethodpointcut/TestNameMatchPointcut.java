/**
 * 
 */
package com.gos.spring.namematchmethodpointcut;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * @author M1012783
 *
 */
public class TestNameMatchPointcut {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {

		//below line works in eclipse but not in intellij
		//BeanFactory beans = new XmlBeanFactory(new FileSystemResource("file:src/com/gos/spring/spring1dot2aop/beforeadvice/aopadvices-beans.xml"));

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf/namematchpointcut-beans.xml");
		Target myser = (Target) applicationContext.getBean("myServices");
		
		System.out.println("From main, calling MyBusiness(0)");
		myser.MyBusiness(0);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling MyBusiness(1)");
		myser.MyBusiness(1);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling MyBusiness(5)");
		myser.MyBusiness(5);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling MyProgram(0)");
		myser.MyProgram(0);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling MyProgram(1)");
		myser.MyProgram(1);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling MyProgram(5)");
		myser.MyProgram(5);
		System.out.println("*********************************************************");
		

	}

}
