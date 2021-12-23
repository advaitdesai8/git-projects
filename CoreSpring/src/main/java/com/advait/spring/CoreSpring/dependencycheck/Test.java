package com.advait.spring.CoreSpring.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/advait/spring/CoreSpring/dependencycheck/config.xml");
		Prescription countriesAndLang= (Prescription) ctx.getBean("prescription");
		System.out.println(countriesAndLang);
		//ctx.registerShutdownHook();
		//System.out.println(customer.getProducts());
		
		//CommonAnnotationBeanPostProcessor
	}

}
