package com.gos.spring.springdi.test;

import com.gos.spring.springdi.service.EmployeeService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class TestDI {
	
	public static void main(String[] args) {

		//below line works in eclipse but not in intellij
		//BeanFactory beans = new XmlBeanFactory(new FileSystemResource("file:src/com/gos/spring/spring1dot2aop/beforeadvice/aopadvices-beans.xml"));

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf/springdi-beans.xml");
		EmployeeService empService = (EmployeeService) applicationContext.getBean("employeeService");
		empService.incrementSalary(100,57222);
	}
}
