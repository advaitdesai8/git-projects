package com.advait.spring.CoreSpring.refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/advait/spring/CoreSpring/refTypes/config.xml");
		Student student= (Student) ctx.getBean("student");
		System.out.println(student);
		//System.out.println(customer.getProducts());
	}

}
