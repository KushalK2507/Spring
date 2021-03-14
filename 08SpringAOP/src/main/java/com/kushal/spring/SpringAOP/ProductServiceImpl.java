package com.kushal.spring.SpringAOP;

import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public void multiply(int num1, int num2, int num3) {
		System.out.println(num1 * num2 * num3);
	}

}
