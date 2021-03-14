package com.kushal.SpringCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// Below create the Spring Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

		// To get the bean
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee Id: " + emp.getId());
		System.out.println("Employee Name: " + emp.getName());
	}
}
