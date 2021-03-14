package com.kushal.SpringCore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLanguanges {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/SpringCore/properties/PropertiesConfig.xml");
		
		Languages bean = (Languages)context.getBean("languages");
		System.out.println(bean.getCountryAndLang());
		
		// By default Properties class
		System.out.println(bean.getCountryAndLang().getClass());
		

	}

}
