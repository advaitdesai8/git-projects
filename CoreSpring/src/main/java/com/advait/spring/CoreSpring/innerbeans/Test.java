package com.advait.spring.CoreSpring.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/advait/spring/CoreSpring/innerbeans/config.xml");
		Employee emp= (Employee)ctx.getBean("employee");
		System.out.println(emp.hashCode());
		Employee emp1= (Employee)ctx.getBean("employee");
		System.out.println(emp1.hashCode());
	}

}
