package com.kushal.spring.SpringAOP.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kushal.spring.SpringAOP.ProductService;

public class AopTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/kushal/spring/SpringAOP/test/Aopconfig.xml");

		ProductService bean = (ProductService) applicationContext.getBean("productServiceImpl");

		System.out.println(bean.multiply(1, 2));
		bean.multiply(1, 2, 3);
	}
}
