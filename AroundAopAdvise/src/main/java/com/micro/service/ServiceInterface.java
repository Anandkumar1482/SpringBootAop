package com.micro.service;

import org.springframework.stereotype.Component;

import com.micro.annotation.MyAnnotation;

@Component
public class ServiceInterface {

	@MyAnnotation
	public String addUser() {
		System.out.println("add user ");
		return "hello";
	}

}
