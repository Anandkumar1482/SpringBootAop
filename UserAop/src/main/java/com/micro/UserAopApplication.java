package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class UserAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAopApplication.class, args);
	}

}
