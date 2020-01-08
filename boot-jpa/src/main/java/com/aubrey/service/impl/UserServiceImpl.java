package com.aubrey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aubrey.dao.UserDao;
import com.aubrey.domain.User;
import com.aubrey.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public void add(User user) {
		userDao.save(user);
	}

	@Override
	public void update(User user) {
		userDao.saveAndFlush(user);
	}

	@Override
	public void del(int id) {
		userDao.deleteById(id);
		
	}

	@Override
	public List<User> query(User user) {
//		List<User> result =  userDao.findAll();
//		return userDao.findByNameAndPassword(user.getName(),user.getPassword());
		return userDao.findByAgeLessThan(user.getAge());
	}
	
	
}
