package com.aubrey;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aubrey.mapper")
public class BootSsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSsmApplication.class, args);
	}

}
