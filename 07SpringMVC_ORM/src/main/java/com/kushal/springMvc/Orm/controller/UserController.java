package com.kushal.springMvc.Orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kushal.springMvc.Orm.entity.User;
import com.kushal.springMvc.Orm.services.UserServices;

@Controller
public class UserController {

	@Autowired
	private UserServices userServices;

	@RequestMapping("/showRegistration")
	public String showRegistration() {
		return "UserReg";
	}

	@RequestMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result = userServices.save(user);
		model.addAttribute("result", "User Created with Id :" + result);
		return "UserReg";
	}
	
	@RequestMapping("/listUsers")
	public String listUsers(ModelMap model)
	{
		List<User> users = userServices.getUsers();
		model.addAttribute("users", users);
		return "DisplayUsers";
	}

	public UserServices getUserServices() {
		return userServices;
	}

	public void setUserServices(UserServices userServices) {
		this.userServices = userServices;
	}

}
