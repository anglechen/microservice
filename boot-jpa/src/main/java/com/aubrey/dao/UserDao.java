package com.aubrey.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aubrey.domain.User;
/**
 * 接口定义参考：https://blog.csdn.net/china_3/article/details/81456735
 * @author Administrator
 *
 */
public interface UserDao  extends JpaRepository<User, Integer>{
	/* ,nativeQuery = true */
	/*
	 * @Query(value = "select u form User u where id =?1") public void test(int id);
	 */
	
	public List<User> findByNameAndPassword(String name, String password);
	
	
	public List<User> findByAgeLessThan(int age);
	
}
