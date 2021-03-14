package com.kushal.springMvc.Orm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kushal.springMvc.Orm.dao.UserDao;
import com.kushal.springMvc.Orm.entity.User;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public int save(User user) {

		System.out.println("In service");

		return userDao.create(user);
		// We can implement some business logic here

	}

	@Override
	public List<User> getUsers() {
		return userDao.findUsers();
	}

}
