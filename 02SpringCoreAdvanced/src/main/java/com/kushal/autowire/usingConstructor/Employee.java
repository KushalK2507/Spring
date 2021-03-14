package com.kushal.autowire.usingConstructor;

public class Employee {

	private Address address;

	public Employee(Address address) {
	this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
