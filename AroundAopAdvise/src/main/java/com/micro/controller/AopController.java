package com.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.micro.service.ServiceInterface;

@Component
public class AopController implements CommandLineRunner {

	@Autowired
	private ServiceInterface serviceInterface;

	@Override
	public void run(String... args) throws Exception {
		serviceInterface.addUser();

	}

}
  