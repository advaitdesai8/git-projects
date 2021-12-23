package com.advait.spring.CoreSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("/com/advait/spring/CoreSpring/config.xml");
		Employee emp= (Employee) ctx.getBean("emp");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}

}
