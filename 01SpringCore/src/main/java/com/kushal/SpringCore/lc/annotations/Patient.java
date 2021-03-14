package com.kushal.SpringCore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter method");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	// This will mark initialize() method as init() method
	@PostConstruct
	public void initialze() {
		System.out.println("Init method");
	}

	// This will mark destroy() package
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Method");
	}

}
