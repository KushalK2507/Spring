package com.kushal.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDaoImpl2 implements OrderDao {

	@Override
	public void createOrder() {
		System.out.println("Inside Order Dao 2");

	}

}
