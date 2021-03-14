package com.kushal.springMvc.Orm.dao;

import java.util.List;

import com.kushal.springMvc.Orm.entity.User;

public interface UserDao {
	
	int create(User user);
	
	List<User> findUsers();
	

}
