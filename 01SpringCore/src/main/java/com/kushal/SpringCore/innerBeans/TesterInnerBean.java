package com.kushal.SpringCore.innerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterInnerBean {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/SpringCore/innerBeans/InnerBeansConfig.xml");

		Employee bean = (Employee) context.getBean("employee");
		System.out.println(bean);
		System.out.println(bean.hashCode());
		System.out.println("---------------");
		Employee bean2 = (Employee) context.getBean("employee");
		System.out.println(bean2);
		System.out.println(bean2.hashCode());

	}

}
