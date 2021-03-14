package com.kushal.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoImpl implements OrderBo {

	@Autowired
	@Qualifier("dao")
	private OrderDao dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside Order Bo");
		dao.createOrder();

	}
}
