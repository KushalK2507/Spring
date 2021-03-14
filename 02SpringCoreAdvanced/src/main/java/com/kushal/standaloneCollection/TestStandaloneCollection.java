package com.kushal.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/standaloneCollection/StandaloneCollectionConfig.xml");
		ProductList bean = (ProductList) context.getBean("products");

		System.out.println(bean);
	}
}
