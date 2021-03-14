package com.kushal.springMvc.Orm.services;

import java.util.List;

import com.kushal.springMvc.Orm.entity.User;

public interface UserServices {
	
	int save(User user);
	
	List<User> getUsers();

}
