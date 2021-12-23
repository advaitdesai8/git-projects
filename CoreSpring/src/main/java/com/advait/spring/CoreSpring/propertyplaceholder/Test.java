package com.advait.spring.CoreSpring.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/advait/spring/CoreSpring/propertyplaceholder/config.xml");
		MyDAO mydao= (MyDAO)ctx.getBean("MyDAO");
		System.out.println(mydao);
		
	}

}
