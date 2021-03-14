package com.kushal.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kushal.SpringJDBC.employee.dao.EmployeeDao;
import com.kushal.SpringJDBC.employee.dto.Employee;

public class TestJDBC {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kushal/SpringJDBC/SpringJDBCConfig.xml");

		EmployeeDao bean = (EmployeeDao) context.getBean("employeeDao");

		// Employee employee = new Employee();
		// employee.setId(2);
		// employee.setFirstName("Komal");
		// employee.setLastName("Kesarwani");
		// System.out.println("Number of records updated : " + bean.update(employee));
		// System.out.println("Number of records deleted : " + bean.delete(1));

		System.out.println("Employee Record" + bean.read(2));
		
		System.out.println("Employee Record" + bean.readall());
	}
}
