package com.kushal.streotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStreotypeAnnotations {

	public static void main(String arg[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/streotypeAnnotations/StreotypeAnnotationsConfig.xml");

		Instructor bean = (Instructor) context.getBean("inst");
		System.out.println(bean);
	}
}
