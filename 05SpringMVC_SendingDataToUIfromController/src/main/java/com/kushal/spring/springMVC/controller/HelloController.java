package com.kushal.spring.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kushal.spring.springMVC.dto.Employee;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id", 152176);
		modelAndView.addObject("name", "Kushal");
		modelAndView.addObject("designation", "Developer");
		return modelAndView;
	}

}
