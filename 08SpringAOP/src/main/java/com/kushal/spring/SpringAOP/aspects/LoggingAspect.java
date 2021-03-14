package com.kushal.spring.SpringAOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	// Inside this we are proving the PointCut expression
	@Before("execution(* com.kushal.spring.SpringAOP.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before calling the method");
	}

	@After("execution(* com.kushal.spring.SpringAOP.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After calling the method");
	}
}
