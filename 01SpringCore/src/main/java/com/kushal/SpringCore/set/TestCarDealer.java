package com.kushal.SpringCore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarDealer {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/kushal/SpringCore/set/SetConfig.xml");

		CarDealer bean = (CarDealer) context.getBean("carDealer");

		System.out.println(bean.getName());
		System.out.println(bean.getModels());
		
		// default Set uses LinkedHashSet
		System.out.println(bean.getModels().getClass().getName());

	}

}
