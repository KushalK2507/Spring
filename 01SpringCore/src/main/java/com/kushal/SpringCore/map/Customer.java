package com.kushal.SpringCore.map;

import java.util.Map;

public class Customer {

	private String id;
	private Map<Integer, String> products;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", products=" + products + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<Integer, String> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}

}
