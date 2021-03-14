package com.kushal.SpringCore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/kushal/SpringCore/map/MapConfig.xml");
		Customer bean = (Customer) context.getBean("customer");

		System.out.println(bean.getId());
		System.out.println(bean.getProducts());

		// Below is default Map used by Spring
		System.out.println(bean.getProducts().getClass().getName());

	}

}
