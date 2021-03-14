package com.kushal.spring.springMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kushal.spring.springMVC.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/empList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("helloList");
		List<Employee> empDetails = new ArrayList<>();

		Employee emp1 = new Employee();
		emp1.setId(152176);
		emp1.setName("Kushal");
		emp1.setDesignation("Developer");

		Employee emp2 = new Employee();
		emp2.setId(152146);
		emp2.setName("Gautami");
		emp2.setDesignation("Developer");

		Employee emp3 = new Employee();
		emp3.setId(152186);
		emp3.setName("Sonal");
		emp3.setDesignation("Developer");

		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);
		modelAndView.addObject("empDetails", empDetails);

		return modelAndView;
	}
}
