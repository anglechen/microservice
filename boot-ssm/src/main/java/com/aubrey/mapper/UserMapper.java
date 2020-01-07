package com.aubrey.mapper;

import java.util.List;

import com.aubrey.domain.User;

public interface UserMapper {
	
	
	public void add(User user);
	
	public void update(User user);
	
	public void del(int id);
	
	public List<User> query(User user);
	
	public User queryById(int id);
	
	

	
	
	
	
	
}
