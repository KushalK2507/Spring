package com.kushal.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kushal.spring.springmvc.dto.User;

@Controller
public class UserControllerUsingModelAttributes {

	@RequestMapping("/showRegitration")
	public String showRegitrationPage() {
		return "UserReg";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST) // name should be exact same which we have
																			// comfigured in JSP page
	public String registerUser(@ModelAttribute("user") User user
			, ModelMap model) {// In this when get from Clinet Spring will
		// 									create the object and assign it to 
		System.out.println(user); // fields.
		model.addAttribute("user", user);
		return "RegResult";

	}

}
