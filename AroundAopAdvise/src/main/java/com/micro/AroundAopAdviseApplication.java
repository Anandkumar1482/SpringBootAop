package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AroundAopAdviseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AroundAopAdviseApplication.class, args);
	}

}
