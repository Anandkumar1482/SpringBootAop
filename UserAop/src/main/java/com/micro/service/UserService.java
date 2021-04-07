package com.micro.service;

import org.springframework.stereotype.Component;

import com.micro.annotation.TxService;

@Component
public class UserService {

	@TxService
	public String addUser() {

		System.out.println("add user sucessfully........");

		/*
		 * if (new Random().nextInt(15) <= 10) { throw new RuntimeErrorException(null,
		 * "after adding user exception araised"); }
		 */

		return "hello";
	}

}
