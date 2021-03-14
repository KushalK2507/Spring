package com.kushal.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/autowire/byName/AutoWireByNameConfig.xml");
		Employee bean = (Employee) context.getBean("emp");

		System.out.println(bean);

	}

}
