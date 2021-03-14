package com.kushal.spring.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kushal.spring.springMVC.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/helloObject")
	public ModelAndView helloObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("helloObject");

		Employee emp = new Employee();
		emp.setId(152176);
		emp.setName("Kushal");
		emp.setDesignation("Developer");

		modelAndView.addObject("empDetails", emp);
		return modelAndView;

	}

}
