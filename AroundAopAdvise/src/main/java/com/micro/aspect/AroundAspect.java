package com.micro.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {

	@Pointcut("@annotation(com.micro.annotation.MyAnnotation)")
	public void p1() {

	}

	/*
	 * from advice, we need to call b.method by using jointpoint details. i.e using
	 * ProceedingJoinPoint it has method proceed() that makes to call b.method. even
	 * it returns value given by b.method (as Object type)
	 */
	@Around("p1()")
	public void beginTx(ProceedingJoinPoint jp) {
		// before advice
		System.out.println("before b.method");

		try {
			// calling business method
			Object obj = jp.proceed();
			System.out.println("the add user return type is :" + obj);
		} catch (Throwable e) {

			e.printStackTrace();
		}

		// after advice
		System.out.println("after b.method");

	}
}
