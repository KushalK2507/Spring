package com.kushal.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjectingInterface {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/injecting/interfaces/InjectInterfaceConfig.xml");
		OrderBo bean = (OrderBo) context.getBean("bo");

		bean.placeOrder();

	}

}
