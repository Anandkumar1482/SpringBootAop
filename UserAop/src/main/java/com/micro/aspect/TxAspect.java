package com.micro.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxAspect {

	@Pointcut("@annotation(com.micro.annotation.TxService)")
	public void p1() {

	}

	@Before("p1()")
	public void beginTx() {
		System.out.println("begin Transaction .......");
	}

	@AfterReturning(pointcut = "p1()", returning = "obj")
	public void commitTx(String obj) {
		System.out.println("commit transaction ! " + obj);
	}

	@After("p1()")
	public void report() {
		System.out.println("report genartated !!!");
	}

	@AfterThrowing(pointcut = "p1()", throwing = "th")
	public void rollback(Throwable th) {
		System.out.println("rollback ! " + th.getMessage());
	}

}
