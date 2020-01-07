package com.aubrey.domain;

import lombok.Data;

@Data
public class User {	
	private Integer id;
	private String name;
	private String password;
	private Integer age;
	private String addr;	
}