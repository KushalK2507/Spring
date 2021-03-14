package com.kushal.spring.SpringJavaConfiguration.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kushal.spring.SpringJavaConfiguration.service.Service;

public class JavaConfigTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				com.kushal.spring.SpringJavaConfiguration.SpringConfig.class);
		// Below is another method to register the config class
		// context.register(SpringConfig.class);

		Service service = context.getBean(Service.class);
		service.save();
		System.out.println(service.hashCode());

		context.close(); // this will let Spring close the context properly and will call the destroy
							// method else destroy method of service class will not be called.
	}
}
