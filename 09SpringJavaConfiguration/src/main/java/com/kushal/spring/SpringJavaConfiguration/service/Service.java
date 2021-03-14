package com.kushal.spring.SpringJavaConfiguration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kushal.spring.SpringJavaConfiguration.dao.Dao;

@Component
public class Service {

	@Autowired
	private Dao dao;

	public void init() {
		System.out.println("Init");
	}
	public void cleanUp() {
		System.out.println("Destroy");
	}

	public void save() {
		System.out.println("Service");
		dao.create();
	}
}
