package com.kushal.SpringCore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInjection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/SpringCore/constructorInjection/ConstructorInjectionconfig.xml");
		Employee bean = (Employee) context.getBean("emp");

		System.out.println(bean);

	}

}
