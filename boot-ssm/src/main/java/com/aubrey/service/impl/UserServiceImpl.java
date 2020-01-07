package com.aubrey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aubrey.domain.User;
import com.aubrey.mapper.UserMapper;
import com.aubrey.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void add(User user) {
		userMapper.add(user);
		
	}

	@Override
	public void update(User user) {
		userMapper.update(user);
		
	}

	@Override
	public void del(int id) {
		userMapper.del(id);
		
	}

	@Override
	public List<User> query(User user) {
		return userMapper.query(user);
	}

	@Override
	public User queryById(int id) {
		return userMapper.queryById(id);
	}

}
