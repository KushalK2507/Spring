package com.kushal.SpringCore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital {

	public static void main(String args[]) {
		
		// below create the Spring container and as deifned in XML it will create
		// the object of hospital(creation of Hospital called IOC) and 
		//inject the values(Dependecy Injection)
				ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/kushal/SpringCore/list/listConfig.xml");

		Hospital hospital = (Hospital) context.getBean("hospital");

		System.out.println("Hospital Name: "+hospital.getName());
		System.out.println("Departments are: "+hospital.getDepartments());
		
		//Since we have declared only list below show which type of list is created
		System.out.println(hospital.getDepartments().getClass());
	}
}
