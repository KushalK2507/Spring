package com.kushal.SpringCore.lc.xml;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter method");
		this.id = id;
	}

	// Name of the method is not mandatory to be init()
	public void init() {
		System.out.println("Hi");
	}

	// Name of the method is not mandatory to be destroy()
	public void destroy() {
		System.out.println("Bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
