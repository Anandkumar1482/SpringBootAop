package com.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.micro.service.UserService;

@Component
public class UserController implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Override
	public void run(String... args) throws Exception {
		userService.addUser();
	}

}
