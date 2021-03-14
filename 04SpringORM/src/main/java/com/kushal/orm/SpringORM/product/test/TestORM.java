package com.kushal.orm.SpringORM.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kushal.orm.SpringORM.product.dao.ProductDao;
import com.kushal.orm.SpringORM.product.entity.Product;

public class TestORM {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kushal/orm/SpringORM/product/test/SpringHibernateConfig.xml");
		ProductDao bean = (ProductDao) context.getBean("productDao");

		// To create
		Product product = new Product();
		product.setName("Iphone11");
		product.setDescription("Worked Gr8");
		product.setPrice(70000);
		System.out.println(bean.create(product));

		// To update
		Product product1 = new Product();
		product1.setId(2);
		product1.setName("Iphone12");
		product1.setPrice(80000);
		bean.update(product1);

		// To fetch single row.
		System.out.println(bean.find(3));

		// To fetch all records

		System.out.println(bean.findAll());
	}

}
