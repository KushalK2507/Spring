package com.kushal.SpringCore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterLifeCycleSpringInterface {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/SpringCore/lc/interfaces/LifeCycleSpringInterfaceconfig.xml");

		Patient bean = (Patient) context.getBean("patient");
		System.out.println(bean);

		// registerShutdownHook() this method is present inside
		// AbstractApplicationContext and is used to tell Spring container to invoke the
		// Destroy method before it destroy's the object
		context.registerShutdownHook();

	}

}
