package com.aubrey.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aubrey.domain.User;

public interface UserDao  extends JpaRepository<User, Integer>{
	/* ,nativeQuery = true */
	/*
	 * @Query(value = "select u form User u where id =?1") public void test(int id);
	 */
}
