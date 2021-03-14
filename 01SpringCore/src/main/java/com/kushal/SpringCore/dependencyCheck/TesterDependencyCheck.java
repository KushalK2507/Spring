package com.kushal.SpringCore.dependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterDependencyCheck {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/SpringCore/dependencyCheck/DependencyCheckConfig.xml");

		Prescription bean = (Prescription) context.getBean("prescription");
		System.out.println(bean);

	}

}
