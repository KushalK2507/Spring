package com.kushal.spring.SpringJavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kushal.spring.SpringJavaConfiguration.dao.Dao;

@Configuration
public class DaoConfig {

	@Bean
	public Dao dao()
	{
		return new Dao();
	}
	
	
}
