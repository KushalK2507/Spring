package com.kushal.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kushal.spring.springmvc.dto.User;

@Controller
public class RequestParamController {

	@RequestMapping("/showData")
	public ModelAndView showUserData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("email") String email) {

		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("RegResult");
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		modelAndView.addObject("user", user);

		return modelAndView;
	}

}
