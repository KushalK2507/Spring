package com.kushal.SpringCore.constructorInjection.ambiquity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterAmbiguity {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/SpringCore/constructorInjection/ambiquity/ConstructorInjectionAmbiguityConfig.xml");

		Addition bean = (Addition) context.getBean("add");
	}
}
