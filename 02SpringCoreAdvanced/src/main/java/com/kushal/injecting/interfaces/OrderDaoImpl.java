package com.kushal.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDaoImpl implements OrderDao {

	@Override
	public void createOrder() {
		System.out.println("Inside Order Dao");

	}

}
