package com.aubrey.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.aubrey.domain.User;

import junit.framework.Assert;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testAdd() {
		User user = new User();
		user.setName("张三");
		user.setPassword("2345678");
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testDel() {
	}

	@Test
	public void testQuery() {
		
		Assert.assertNotNull(userService.query(new User()));
		
		
	}

	@Test
	public void testQueryById() {
	}

}
