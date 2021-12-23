package com.advait.spring.CoreSpring.lc.springinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("/com/advait/spring/CoreSpring/lc/springinterface/config.xml");
		Patient countriesAndLang= (Patient) ctx.getBean("patient");
		System.out.println(countriesAndLang);
		ctx.registerShutdownHook();
		//System.out.println(customer.getProducts());
	}

}
