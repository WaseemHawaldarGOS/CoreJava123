/**
 * 
 */
package com.gos.spring.staticjdkregexpointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author M1012783
 *
 */
public class TestPointcut {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {

		//below line works in eclipse but not in intellij
		//BeanFactory beans = new XmlBeanFactory(new FileSystemResource("file:src/com/gos/spring/spring1dot2aop/beforeadvice/aopadvices-beans.xml"));

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf/pointcuts-beans.xml");
		Target myser = (Target) applicationContext.getBean("pointcutService");
		
		System.out.println("From main, calling Mylogic(0)");
		myser.Mylogic(0);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling Mylogic2(0)");
		myser.Mylogic2(0);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling NewMylogic3(0)");
		myser.NewMylogic3(0);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling MyProgram(0)");
		myser.MyProgram(0);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling MyProgram2(0)");
		myser.MyProgram2(0);
		System.out.println("*********************************************************");
		
		System.out.println("From main, calling NewMyProgram3(0)");
		myser.NewMyProgram3(0);
		System.out.println("*********************************************************");
		

	}

}
