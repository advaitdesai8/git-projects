package com.advait.spring.CoreSpring.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("/com/advait/spring/CoreSpring/set/set_config.xml");
		CarDealer car= (CarDealer) ctx.getBean("cardealer");
		System.out.println(car.getName());
		System.out.println(car.getModels());
	}

}
