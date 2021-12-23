package com.advait.spring.CoreSpring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/advait/spring/CoreSpring/properties/props_config.xml");
		CountriesAndLanguages countriesAndLang= (CountriesAndLanguages) ctx.getBean("countriesAndLang");
		System.out.println(countriesAndLang);
		//System.out.println(customer.getProducts());
	}

}
