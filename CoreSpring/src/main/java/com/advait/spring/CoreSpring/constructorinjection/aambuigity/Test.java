package com.advait.spring.CoreSpring.constructorinjection.aambuigity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/advait/spring/CoreSpring/constructorinjection/aambuigity/config.xml");
		Addition emp= (Addition)ctx.getBean("addition");
		System.out.println(emp);
		
	}

}
                                      