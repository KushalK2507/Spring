package com.kushal.SpringCore.propertyPlaceHolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterPropertyPlaceHolder {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/SpringCore/propertyPlaceHolder/PropertyPlaceHolderConfig.xml");

		MyDao bean = (MyDao) context.getBean("myDao");
		System.out.println(bean);
	}
}
