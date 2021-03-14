package com.kushal.spring.SpringJavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.kushal.spring.SpringJavaConfiguration.service.Service;

@Configuration
@Import(DaoConfig.class)
public class SpringConfig {

	// in this we will give the init and destroy method's
	// which are present in Service class.
	@Bean(initMethod = "init", destroyMethod = "cleanUp")
	public Service service() {
		return new Service();
	}

}
